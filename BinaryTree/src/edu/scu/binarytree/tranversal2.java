package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import static java.util.Collections.reverse;

public class tranversal2 {
    public static List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)return list;
        //TreeNode curr = root;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null)stack.push(node.right);
            if(node.left!=null)stack.push(node.left);
        }
        return list;
    }
    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;//找到该子树下的最左节点，然后开始向上遍历
            }
            else{
                cur = stack.pop();//当前中节点
                list.add(cur.val);
                cur = cur.right;//访问当前节点右节点
            }
        }
        return list;
    }
    public static List<Integer> PostorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)return list;
        //TreeNode curr = root;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.left!=null)stack.push(node.left);
            if(node.right!=null)stack.push(node.right);
        }
        //利用前序遍历调换左右节点进栈顺序得到中右左，然后reverse
        Collections.reverse(list);
        return list;
    }
}

package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class tranversal3 {
    //统一迭代遍历
    //当前写法为中序遍历
    public static List<Integer> Intorderrevarsal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root!=null)stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node!=null){
                stack.pop();//将当前中节点先出栈，让右节点先入栈
                if(node.right!=null)stack.push(node.right);//右
                stack.push(node);
                stack.push(null);//对当前节点添加待操作空指针，也就是中节点
                if(node.left!=null)stack.push(node.left);//左
            }
            else{
                stack.pop();//弹出指示待操作的空指针
                list.add(stack.pop().val);
            }
        }
        return list;
    }
}

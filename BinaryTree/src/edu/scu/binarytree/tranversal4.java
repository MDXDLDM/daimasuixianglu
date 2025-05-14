package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class tranversal4 {
    public static List<List<Integer>> levelorderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();//从根节点到叶节点的层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)return result;
        queue.add(root);
        while(!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> list = new ArrayList<>();
            while(length>0){
                TreeNode node = queue.poll();
                if(node.left != null)queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                list.add(node.val);
                length--;
            }
            result.add(list);
        }
        return result;
    }
}

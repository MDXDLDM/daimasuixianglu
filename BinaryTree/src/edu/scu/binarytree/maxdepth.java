package edu.scu.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class maxdepth {
    public static int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)return 0;
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            while(length>0){
                TreeNode node = queue.poll();
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                length--;
            }
            depth++;
        }
        return depth;
    }
}

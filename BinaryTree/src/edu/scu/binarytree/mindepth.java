package edu.scu.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class mindepth {
    public static int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)return 0;
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            while(length>0){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null)return depth+1;
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                length--;
            }
            depth++;
        }
        return depth;
    }
}

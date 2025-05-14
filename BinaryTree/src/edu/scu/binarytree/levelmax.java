package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelmax {
    public static List<Integer> LevelMax(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)return list;
        queue.add(root);
        while(!queue.isEmpty()) {
            int length = queue.size();
            int max = Integer.MIN_VALUE;
            while(length>0){
                TreeNode node = queue.poll();
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                if(max<node.val)max=node.val;
                length--;
            }
            list.add(max);
        }
        return list;
    }
}

package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class averageoflevels {
    public static List<Double> AverageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        if(root == null)return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int length = queue.size();
            int cur=length;
            double sum = 0.0;
            while(length > 0) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                length--;
            }
            list.add(sum/cur);
        }
        return list;
    }
}

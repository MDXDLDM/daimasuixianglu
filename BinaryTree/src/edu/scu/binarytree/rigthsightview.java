package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rigthsightview {
    public static List<Integer> RightSightView(TreeNode root){
        List<Integer> result = new ArrayList<Integer>();
        if(root == null)return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int length = queue.size();
            while(length > 0){
                TreeNode node = queue.poll();
                if(length==1)result.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                length--;
            }
        }
        return result;
    }
}

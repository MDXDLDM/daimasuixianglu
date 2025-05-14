package edu.scu.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class countnodes {
    public static int countNodes(TreeNode root) {
//        int count = 0;
//        if (root == null) return count;
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            while(size>0) {
//                TreeNode node = queue.poll();
//                if (node.left != null) queue.add(node.left);
//                if (node.right != null) queue.add(node.right);
//                count++;
//                size--;
//            }
//        }
//        return count;
        //上面为层序遍历，下面使用递归
//        if(root == null)return 0;
//        int leftnum = countNodes(root.left);//左
//        int rightnum = countNodes(root.right);//右
//        return leftnum + rightnum+1;//加上本节点，中
        //下面利用完全二叉树的特性来进行一些特殊判断
        if (root == null)return 0;
        int leftl=1,rightl=1;
        TreeNode leftfirst=root.left,rightfirst=root.right;
        while(leftfirst!=null){
            leftl++;
            leftfirst=leftfirst.left;
        }
        while(rightfirst!=null){
            rightl++;
            rightfirst=rightfirst.right;
        }
        if(leftl==rightl)return (int)Math.pow(2,leftl)-1;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}

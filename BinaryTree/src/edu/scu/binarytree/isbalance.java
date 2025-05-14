package edu.scu.binarytree;

public class isbalance {
    public static boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        if(getHeight(root)==-1)return false;
        return true;
    }
    public static int getHeight(TreeNode root) {
        if(root==null)return 0;
        int left=getHeight(root.left);
        if(left==-1)return -1;
        int right=getHeight(root.right);
        if(right==-1)return -1;
        int judge=Math.abs(left-right);
        if(judge>1)return -1;
        else return Math.max(left,right)+1;//注意此处返回时要加上本节点
    }
}

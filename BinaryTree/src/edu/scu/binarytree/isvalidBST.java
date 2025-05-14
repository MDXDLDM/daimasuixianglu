package edu.scu.binarytree;

import java.math.BigInteger;

public class isvalidBST {
    public boolean isValidBST(TreeNode root) {
        if(root == null)return true;
        if(root.left == null && root.right == null)return true;
        return judge(root.left, Long.MIN_VALUE,root.val)&&judge(root.right,root.val,Long.MAX_VALUE);
    }
    public boolean judge(TreeNode root,long min,long max) {
        if(root == null)return true;
        if(root.val<=min||root.val>=max)return false;
        return judge(root.left,min, root.val)&&judge(root.right,root.val,max);
    }
}

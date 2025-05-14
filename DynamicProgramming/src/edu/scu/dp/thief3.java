package edu.scu.dp;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class thief3 {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        int[] res=dp(root);
        return Math.max(res[0], res[1]);
    }
    private int[] dp(TreeNode root) {
        if(root == null) return new int[2];//明确数组概念，第一个是偷当前节点的最大值，第二个是不偷的最大值
        if(root.left == null && root.right == null) return new int[]{root.val,0};
        int[] left = dp(root.left);
        int[] right = dp(root.right);
        return new int[]{root.val+left[1]+right[1],Math.max(left[0],left[1])+Math.max(right[0],right[1])};
    }
}

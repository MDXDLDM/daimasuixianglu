package edu.scu.binarytree;

public class sumofleftleaves {
    public static int sumOfLeftLeaves(TreeNode root) {
//        if(root == null)return 0;
//        int sum = 0;
//        sum=getsum(root,0);
//        return sum;//接下来只在该函数里实现
        if(root == null)return 0;
        if(root.left == null && root.right == null)return 0;
        int leftsum = sumOfLeftLeaves(root.left);
        if(root.left != null&& root.left.left == null && root.left.right == null)leftsum+=root.left.val;
        int rightsum = sumOfLeftLeaves(root.right);
        return leftsum + rightsum;
    }
    public static int getsum(TreeNode root,int sum) {
        if(root == null)return 0;
        if(root.left!=null){
            sum=getsum(root.left,sum);
            if(root.left.left==null && root.left.right==null)sum+=root.left.val;
        }
        if(root.right!=null){
            sum=getsum(root.right,sum);
        }
        return sum;
    }
}

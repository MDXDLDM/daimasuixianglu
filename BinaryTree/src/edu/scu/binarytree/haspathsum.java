package edu.scu.binarytree;

public class haspathsum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root ==null){
            return sum == 0;
        }
        if(root.left == null && root.right == null){
            return sum== root.val;
        }
        boolean left=false;
        boolean right=false;
        if(root.left!=null){
            left=hasPathSum(root.left,sum-root.val);
        }
        if(root.right!=null){
            right=hasPathSum(root.right,sum-root.val);
        }
        return left||right;
    }
}

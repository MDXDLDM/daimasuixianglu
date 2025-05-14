package edu.scu.greedy;

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
public class camera {
    public int minCameraCover(TreeNode root) {
        if (root==null) return 0;
        if (root.left == null&&root.right == null) return 1;
        if(judgeend(root))return 1;
        if(root.left!=null){
            TreeNode root1=root.left.left;
            TreeNode root2=root.left.right;
            int num1=0;int num2=0;
            if(root1!=null&& !judgeend(root1)){
                num1=minCameraCover(root1.left)+minCameraCover(root1.right);
            }
            if(judgeend(root1))num1=1;
            if(root2!=null&& !judgeend(root2)){
                num2=minCameraCover(root2.left)+minCameraCover(root2.right);
            }
            if(judgeend(root2))num2=1;
            return 1+num1+num2+minCameraCover(root.right);
        }
        else{
            TreeNode root1=root.right.left;
            TreeNode root2=root.right.right;
            int num1=0;int num2=0;
            if(root1!=null&& !judgeend(root1)){
                num1=minCameraCover(root1.left)+minCameraCover(root1.right);
            }
            if(judgeend(root1))num1=1;
            if(root2!=null&& !judgeend(root2)){
                num2=minCameraCover(root2.left)+minCameraCover(root2.right);
            }
            if(judgeend(root2))num2=1;
            return 1+num1+num2+minCameraCover(root.left);
        }
    }
    private boolean judgeend(TreeNode root){
        return root!=null&&root.left != null && root.right != null && root.left.left == null && root.left.right == null && root.right.left == null && root.right.right == null;
    }
}

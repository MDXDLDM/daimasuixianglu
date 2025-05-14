package edu.scu.binarytree;

public class convertBST {
    public TreeNode ConvertBST(TreeNode root) {
        reInorder(root);
        return root;
    }
    TreeNode pre=null;
    public void reInorder(TreeNode root) {
        if(root==null)return;
        if(root.right!=null){
            reInorder(root.right);
        }
        if(pre!=null){
            root.val+=pre.val;
        }
        pre=root;
        if(root.left!=null){
            reInorder(root.left);
        }
    }
}

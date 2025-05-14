package edu.scu.binarytree;

public class commonances {
    public TreeNode CommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p||root==q||root==null)return root;//若遇到p或q直接返回，那么遇到p，q在同一子树其实也是一样的
        TreeNode left=CommonAncestor(root.left,p,q);//因为这样的话回溯到根节点的时候就会一边为空一边不为空
        TreeNode right=CommonAncestor(root.right,p,q);//那么依然会返回不为空的公共最近节点
        if(left==null&&right==null)return null;
        else if(left!=null&&right!=null)return root;
        return left!=null?left:right;
    }
}

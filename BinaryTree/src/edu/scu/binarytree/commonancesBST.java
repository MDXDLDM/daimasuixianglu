package edu.scu.binarytree;

public class commonancesBST {
    public TreeNode CommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)return null;
        if((p.val<root.val&&q.val>root.val)||(p.val>root.val&&q.val<root.val))return root;
        if(p.val<root.val&&q.val<root.val)return CommonAncestorBST(root.left,p,q);
        else return CommonAncestorBST(root.right,p,q);
    }
}

package edu.scu.binarytree;

public class searchBST {
    public TreeNode SearchBST(TreeNode root, int val) {
        if(root==null) return null;//以下节点不为空
        if(root.val==val) return root;//以下节点值与val不等
        if(root.left==null && root.right==null) return null;
        if(root.val>val) return SearchBST(root.left, val);
        return SearchBST(root.right, val);
    }
}

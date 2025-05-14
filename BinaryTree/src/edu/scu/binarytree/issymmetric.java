package edu.scu.binarytree;

public class issymmetric {
    public static boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return Compare(root.left, root.right);
    }
    public static boolean Compare(TreeNode rootleft, TreeNode rootright) {
        if(rootleft == null && rootright == null)return true;
        else if(rootleft == null || rootright == null)return false;
        else if(rootleft.val != rootright.val)return false;
        else return Compare(rootleft.left, rootright.right)&&Compare(rootleft.right, rootright.left);
    }
}

package edu.scu.binarytree;

public class insertintoBST {
    public TreeNode InsertintoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(val>root.val){
            root.right=InsertintoBST(root.right,val);
        }
        else if(val<root.val){
            root.left=InsertintoBST(root.left,val);
        }
        return root;
    }
}

package edu.scu.binarytree;

public class deletenodeBST {
    public TreeNode DeleteNodeBST(TreeNode root, int key) {
        if(root==null)return null;
        if(key>root.val){
            root.right=DeleteNodeBST(root.right,key);
        }
        else if(key<root.val){
            root.left=DeleteNodeBST(root.left,key);
        }
        else if(key==root.val){
            if(root.left==null&&root.right==null){
                return null;
            }
            else if(root.left!=null&&root.right!=null){
                TreeNode temp=root.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=root.right;
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            else{
                return root.left;
            }
        }
        return root;
    }

}

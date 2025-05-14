package edu.scu.binarytree;

public class cutBST {
    public TreeNode cutBST(TreeNode root, int low, int high) {
//        if(root == null)return null;
//        if(root.val>high){
//            return cutBST(root.left,low,high);
//        }else if(root.val<low){
//            return cutBST(root.right,low,high);
//        }else{
//            root.left=cutBST(root.left,low,high);
//            root.right=cutBST(root.right,low,high);
//        }
//        return root;
        //下面使用迭代
        if(root == null)return null;
        while(root.val>high||root.val<low){
            if(root.val>high)root=root.left;
            else root=root.right;
            if(root==null)return null;
        }

        System.out.println(root.val);
        //处理左子树,因为根节点已经在range里了，只需处理最左侧节点，删掉所有小于low的
        TreeNode temp=root;
        while(temp.left!=null){
            if(temp.left.val<low){
                temp.left=temp.left.right;
            }
            else{
                temp=temp.left;
            }
        }
        temp=root;
        //处理最右侧节点同理
        while(temp.right!=null){
            if(temp.right.val>high){
                temp.right=temp.right.left;
            }
            else{
                temp=temp.right;
            }
        }
        return root;
    }
}

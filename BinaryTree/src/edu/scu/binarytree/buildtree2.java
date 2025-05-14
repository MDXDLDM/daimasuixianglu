package edu.scu.binarytree;

public class buildtree2 {
    public TreeNode buildTreeout2(int[] preorder,int prestart,int preend, int[] inorder,int instart,int inend) {
        if(prestart==preend)return null;
        TreeNode node=new TreeNode(preorder[prestart]);
        if(prestart-preend==1)return node;
        int index=0;
        for(;index<inorder.length;index++){
            if(inorder[index]==node.val)break;
        }
        int leftprestart=prestart+1;
        int leftpreend=leftprestart+index-instart;
        int leftinstart=instart;
        int leftinend=index;
        int rightprestart=leftpreend;
        int rightpreend=preend;
        int rightinstart=index+1;
        int rightinend=inend;
        node.left=buildTreeout2(preorder,leftprestart,leftpreend,inorder,leftinstart,leftinend);
        node.right=buildTreeout2(preorder,rightprestart,rightpreend,inorder,rightinstart,rightinend);
        return node;
    }

    public TreeNode buildTree2(int[] preorder,int[] inorder) {
        return buildTreeout2(preorder,0,preorder.length,inorder,0,inorder.length);
    }
}

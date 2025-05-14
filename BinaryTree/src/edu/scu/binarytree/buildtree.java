package edu.scu.binarytree;

public class buildtree {
//    static int indexin=0;
//    static int indexpost=0;
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        indexin=inorder.length-1;
//        indexpost=postorder.length-1;
//        return gettree(inorder,postorder);
//    }
//    public TreeNode gettree(int[] inorder, int[] postorder) {
//        if(indexin<0||indexpost<0)return null;
//        TreeNode node=new TreeNode(postorder[indexpost]);
//        System.out.print(indexpost+" "+node.val);
//        indexpost--;
//        System.out.println(" "+indexpost);
//        if(node.val==inorder[indexin]){
//            indexin--;
//            return node;
//        }
//        node.right=gettree(inorder,postorder);
//        node.left=gettree(inorder,postorder);
//        return node;
//    }
//
//    public static void main(String[] args) {
//        buildtree b=new buildtree();
//        int[] inorder={2,1};
//        int[] postorder={2,1};
//        TreeNode root=b.buildTree(inorder,postorder);
//    }
    public TreeNode buildTreeout(int[] inorder,int instart,int inend, int[] postorder,int poststart,int postend) {
        if(poststart==postend)return null;//构建完当前子树所有的节点了
        TreeNode node=new TreeNode(postorder[postend-1]);
        if(postend-poststart==1)return node;//当前子树的叶节点
        int index=instart;
        for(;index<inend;index++){
            if(inorder[index]==node.val)break;
        }//获取用于切割的index
        //切割中序数组，获取当前中节点的左右子树数组
        //切割后序数组，用来获取左右子树的下一个中节点
        int leftinstart=instart;//左闭右开
        int leftinend=index;
        int rightinstart=index+1;
        int rightinend=inend;
        int leftpoststart=poststart;
        int leftpostend=leftpoststart+(leftinend-leftinstart);
        int rightpoststart=leftpostend;
        int rightpostend=postend-1;
        node.left=buildTreeout(inorder,leftinstart,leftinend,postorder,leftpoststart,leftpostend);
        node.right=buildTreeout(inorder,rightinstart,rightinend,postorder,rightpoststart,rightpostend);
        return node;
    }
    public TreeNode builTree(int[] inorder,int[] postorder){
        return buildTreeout(inorder,0,inorder.length,postorder,0,postorder.length);
    }
}

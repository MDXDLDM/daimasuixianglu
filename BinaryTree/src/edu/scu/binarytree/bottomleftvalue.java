package edu.scu.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class bottomleftvalue {
    int maxdepth=0;
    int result=0;
    public int BottomLeftValue(TreeNode root) {
//        if(root == null)return 0;
//        int res=0;
//        Queue<TreeNode> q = new LinkedList<TreeNode>();
//        q.add(root);
//        while(!q.isEmpty()){
//            int size = q.size();
//            if(q.peek().left == null && q.peek().right == null){
//                res=q.peek().val;
//            }
//            for(int i = 0; i < size; i++){
//                TreeNode node = q.poll();
//                if(node.left != null)q.add(node.left);
//                if(node.right != null)q.add(node.right);
//            }
//        }
//        return res;
        if(root==null)return 0;
        getleft(root,1);
        return result;
    }
    //下面使用递归

    public void getleft(TreeNode root,int depth) {
        if(root.left==null&&root.right==null) {
            if(maxdepth<depth){
                maxdepth=depth;
                result=root.val;
            }
        }
        if(root.left!=null){
            getleft(root.left,depth+1);
        }
        if(root.right!=null){
            getleft(root.right,depth+1);
        }
    }
}

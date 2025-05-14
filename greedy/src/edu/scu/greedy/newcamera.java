package edu.scu.greedy;

public class newcamera {
    int count=0;
    public int minCameraCover(TreeNode root){
        if(postorder(root)==0)count++;
        return count;
    }
    //0 未覆盖 1 摄像头 2 覆盖
    private int postorder(TreeNode root){
        if(root==null)return 2;//让真正的叶节点值2为0
        int left=postorder(root.left);
        int right=postorder(root.right);
        if(left==0||right==0){
            count++;
            return 1;
        }
        if(left==1||right==1){
            return 2;
        }
        if(left==2&&right==2){
            return 0;
        }
        return 0;
    }
}

package edu.scu.binarytree;

public class maxnumbinarytree {
    public TreeNode buildway(int[] nums,int start,int end) {
        //注意左闭右开
        if(start>=end)return null;
        if(end-start==1)return new TreeNode(nums[start]);
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=start;i<end;i++) {
            if(nums[i]>max) {
                max=nums[i];
                index=i;
            }
        }
        TreeNode node=new TreeNode(nums[index]);
        int leftstart=start;
        int leftend=index;
        int rightstart=index+1;
        int rightend=end;
        node.left=buildway(nums,leftstart,leftend);
        node.right=buildway(nums,rightstart,rightend);
        return node;
    }
    public TreeNode maxBuildTree(int[] nums) {
        return buildway(nums,0,nums.length);
    }
}

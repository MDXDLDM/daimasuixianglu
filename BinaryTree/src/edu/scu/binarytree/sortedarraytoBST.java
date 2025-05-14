package edu.scu.binarytree;

public class sortedarraytoBST {
    public TreeNode sortedArrayToBST(int[] nums,int start,int end) {
        if(start>=end) return null;
        int index=(start+end)/2;
        TreeNode root=new TreeNode(nums[index]);
        root.left=sortedArrayToBST(nums,start,index);
        root.right=sortedArrayToBST(nums,index+1,end);
        return root;
    }
}

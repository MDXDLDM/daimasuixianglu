package edu.scu.greedy;

public class maxsubarray {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int temp=count+nums[i];
            if(temp<=0){
                count=0;
            }else{
                count=temp;
            }
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}

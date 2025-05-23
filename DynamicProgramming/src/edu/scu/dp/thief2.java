package edu.scu.dp;

public class thief2 {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        dp1[0]=nums[0];
        dp2[1]=nums[1];
        for(int i=1;i<nums.length-1;i++){
            if (i - 2 >= 0) {
                dp1[i]=Math.max(dp1[i-2]+nums[i],dp1[i-1]);
            }else{
                dp1[i]=Math.max(nums[i],dp1[i-1]);
            }
        }
        for(int i=2;i<nums.length;i++){
            if (i - 3 >= 0) {
                dp2[i]=Math.max(dp2[i-2]+nums[i],dp2[i-1]);
            }else{
                dp2[i]=Math.max(nums[i],dp2[i-1]);
            }
        }
        return Math.max(dp1[nums.length-2],dp2[nums.length-1]);
    }
}

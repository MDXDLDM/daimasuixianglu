package edu.scu.dp;

public class maxsubarr {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int res=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}

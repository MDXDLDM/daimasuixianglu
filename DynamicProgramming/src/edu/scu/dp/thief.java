package edu.scu.dp;

public class thief {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if (i - 2 >= 0) {
                dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            }else{
                dp[i]=Math.max(nums[i],dp[i-1]);
            }
        }
        return dp[nums.length-1];
    }
}

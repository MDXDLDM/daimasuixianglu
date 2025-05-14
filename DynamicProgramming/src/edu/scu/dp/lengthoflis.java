package edu.scu.dp;

public class lengthoflis {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1)return 0;
        int[] dp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            dp[i] = 1;
        }
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(dp[i]>res)res = dp[i];
        }
        return res;
    }
}

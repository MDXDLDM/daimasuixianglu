package edu.scu.dp;

public class lcis {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res=1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                if (dp[i] > res) {
                    res = dp[i];
                }
            }else{
                dp[i] = 1;
            }
        }
        return res;
    }
}

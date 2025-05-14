package edu.scu.dp;

public class partion {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0)return false;
        int[] dp=new int[sum/2+1];
        for(int i=0;i< nums.length;i++){
            for(int j=sum/2;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
                if(dp[j]==sum/2)return true;
            }
        }
        return false;
    }
}

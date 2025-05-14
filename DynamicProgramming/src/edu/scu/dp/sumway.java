package edu.scu.dp;

public class sumway {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if((sum+target)%2!=0||(sum+target<0))return 0;
        int bagsize=(sum+target)/2;
        int[][] dp=new int[nums.length][bagsize+1];//dp[i][j]的值表示可放置i个物品且达到容量为j的情况有几种
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)count++;
            dp[i][0]= (int) Math.pow(2,count);
        }
        if(nums[0]<=bagsize)dp[0][nums[0]]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<=bagsize;j++){
                dp[i][j]=dp[i-1][j];
                if(j-nums[i]>=0){
                    dp[i][j]+=dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[nums.length-1][bagsize];
    }
}

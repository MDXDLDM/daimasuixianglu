package edu.scu.dp;

public class maxprofit5 {
    public int maxProfit(int[] prices) {
        if(prices.length==1)return 0;
        int[][] dp = new int[prices.length][4];
        dp[0][0]=-prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],Math.max(dp[i-1][3]-prices[i],dp[i-1][1]-prices[i]));//持有股票的状态
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][3]);//不持有股票的状态(不包含空窗期)
            dp[i][2]=dp[i-1][0]+prices[i];
            dp[i][3]=dp[i-1][2];
        }
        return Math.max(dp[prices.length-1][2],Math.max(dp[prices.length-1][1],dp[prices.length-1][3]));
    }
}

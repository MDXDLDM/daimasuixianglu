package edu.scu.dp;

public class maxprofit6 {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length==1)return 0;
        int[] dp = new int[2];
        dp[0]=-prices[0];
        for(int i=1;i<prices.length;i++){
            dp[0]=Math.max(dp[0],dp[1]-prices[i]);
            dp[1]=Math.max(dp[1],dp[0]+prices[i]-fee);
        }
        return dp[1];
    }
}

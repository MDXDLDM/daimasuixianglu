package edu.scu.dp;

public class maxprofit4 {
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 1)return 0;
        int[] dp= new int[k*2];
        for(int i=0;i<k;i++){
            dp[i*2]=-prices[0];
        }
        for(int i=1;i<prices.length;i++){
            dp[0]=Math.max(dp[0],-prices[i]);
            dp[1]=Math.max(dp[1],dp[0]+prices[i]);
            for(int j=1;j<k;j++){
                dp[j*2]=Math.max(dp[j*2],dp[j*2-1]-prices[i]);
                dp[j*2+1]=Math.max(dp[j*2+1],dp[j*2]+prices[i]);//逻辑是maxprofit3的推广
            }
        }
        return dp[k*2-1];
    }
}

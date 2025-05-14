package edu.scu.binarytree;

public class maxprofit2 {
    public int maxProfit(int[] prices) {
        if(prices.length==1)return 0;
        int[] dp=new int[2];
        dp[0]=-prices[0];//dp[1]=0;
        for(int i=1;i<prices.length;i++){
            dp[0]=Math.max(dp[0],dp[1]-prices[i]);
            //若当前持有时，取max，前一天持有或者前一天卖出当天买入
            dp[1]=Math.max(dp[1],dp[0]+prices[i]);
            //若当天不持有，取max，前一天也不持有或者前一天持有当天卖出
        }
        return dp[1];
    }
}

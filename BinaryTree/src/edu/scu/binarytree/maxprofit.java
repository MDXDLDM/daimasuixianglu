package edu.scu.binarytree;

public class maxprofit {
    public int maxProfit(int[] prices) {
//        int min=prices[0];
//        int max=0;
//        int[] dp=new int[prices.length];
//        for(int i=1;i<prices.length;i++){
//            dp[i]=prices[i]-min;
//            if(prices[i]<min)min=prices[i];
//            if(dp[i]>max)max=dp[i];
//        }
//        return max;贪心
        int[] dp=new int[2];
        dp[0]=Integer.MAX_VALUE;
        dp[1]=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            dp[0]=Math.min(dp[0],prices[i]);
            dp[1]=Math.max(dp[1],prices[i]-dp[0]);
        }
        return dp[1];
    }
}

package edu.scu.binarytree;

public class maxprofit3 {
    public int maxProfit(int[] prices) {
        if(prices.length==1)return 0;
        int[] dp=new int[4];
        dp[0]=-prices[0];//dp[1]=0;
        dp[2]=-prices[0];//dp[3]=0;
        for(int i=1;i<prices.length;i++){
            dp[0]=Math.max(dp[0],-prices[i]);//第一次购入股票的最优
            dp[1]=Math.max(dp[1],dp[0]+prices[i]);//第一次出售股票的最优
            dp[2]=Math.max(dp[2],dp[1]-prices[i]);//第二次购入股票的最优,当没有进行第一次交易时，dp[1]=0，dp[2]始终为0而不会改变
            dp[3]=Math.max(dp[3],dp[2]+prices[i]);//第二次出售股票后的最优
            //若只进行了一次交易，则在此次交易时，dp[1]会通过dp[2]传递到dp[3]，在只有一次交易时也能通过dp[3]返回正确答案
            //这只是笼统的理解，实际上是有可能每一次的第一次出售都会刷新，然后进行了传递
            //这也是为什么最后返回的直接是dp3而不是max最大值，因为刷新dp数组是从0-3进行的
            //所以相当于可以当天买当天卖，完成了两次交易，dp1一定会传递给dp3
        }
        return dp[3];
    }
}

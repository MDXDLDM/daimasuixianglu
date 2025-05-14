package edu.scu.dp;

public class coinchange {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)return 0;
        int[] dp = new int[amount + 1];
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                int temp=j-coins[i];
                if(temp>=0){
                    if(dp[temp]!=0||temp==0){
                        if(dp[j]==0) dp[j]=dp[temp]+1;
                        dp[j]=Math.min(dp[j],dp[temp]+1);
                    }
                }
            }
        }
        return dp[amount]==0?-1:dp[amount];
    }
}

package edu.scu.dp;

public class findchange {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        if(coins[0]<=amount){
            for(int i=coins[0]; i<=amount; i++){
                if(i%coins[0]==0){
                    dp[i]=1;
                }
            }
        }
        for(int i=1;i< coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i]<=j){
                    dp[j] += dp[j-coins[i]];
                }
            }
        }
        return dp[amount];
    }
}

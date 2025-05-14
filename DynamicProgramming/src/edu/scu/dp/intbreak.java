package edu.scu.dp;

public class intbreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        //dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            for(int j=2;j<=i-1;j++){
                dp[i]=Math.max(dp[i],dp[j]*(i-j));
                dp[i]=Math.max(dp[i],j*(i-j));
            }
        }
        return dp[n];
    }
}

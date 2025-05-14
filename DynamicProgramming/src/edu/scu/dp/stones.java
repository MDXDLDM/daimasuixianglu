package edu.scu.dp;

public class stones {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int half = sum / 2;
        int[] dp=new int[half+1];
        for(int i=0;i<stones.length;i++){
            for(int j=half;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-dp[half]*2;
    }
}

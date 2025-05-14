package edu.scu.dp;

public class maxform {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for(int i=0;i<strs.length;i++){
            int zeronum=0;
            int onenum=0;
            for(int j=0;j<strs[i].length();j++){
                if(strs[i].charAt(j)=='1'){
                    onenum++;
                }else if(strs[i].charAt(j)=='0'){
                    zeronum++;
                }
            }
            for(int j=m;j>=zeronum;j--){
                for(int k=n;k>=onenum;k--){
                    dp[j][k]=Math.max(dp[j][k],dp[j-zeronum][k-onenum]+1);
                }
            }
        }
        return dp[m][n];
    }
}

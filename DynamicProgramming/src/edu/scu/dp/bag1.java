package edu.scu.dp;

import java.util.Scanner;

public class bag1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bagsize = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for(int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            value[i] = sc.nextInt();
        }
        int[][] dp=new int[n][bagsize+1];
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=bagsize;i++){
            if(i>=weight[0]){
                dp[0][i]=value[0];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=bagsize;j++){
                if(j<weight[i]){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }
        System.out.println(dp[n-1][bagsize]);
    }
}

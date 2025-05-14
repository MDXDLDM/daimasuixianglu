package edu.scu.dp;

import java.util.Scanner;

public class bag2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bagsize=sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        int[] dp = new int[bagsize+1];
        for(int i=0;i<n;i++){
            for(int j=bagsize;j>=weight[i];j--){
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }
        System.out.println(dp[bagsize]);
    }
}

package edu.scu.dp;

import java.util.Scanner;

public class fullbag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int categories = sc.nextInt();
        int bagsize = sc.nextInt();
        int[] weights = new int[categories];
        int[] values = new int[categories];
        for (int i = 0; i < categories; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
        int[] dp = new int[bagsize + 1];
        for(int i=0;i<categories;i++){
            for(int j=weights[i];j<=bagsize;j++){
                dp[j] = Math.max(dp[j], dp[j-weights[i]]+values[i]);
            }
        }
        System.out.println(dp[bagsize]);
    }
}

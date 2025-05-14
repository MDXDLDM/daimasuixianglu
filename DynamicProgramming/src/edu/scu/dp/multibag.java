package edu.scu.dp;

import java.util.Scanner;

public class multibag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bagsize = sc.nextInt();
        int categories = sc.nextInt();
        int[] weights = new int[categories];
        int[] values = new int[categories];
        for(int i = 0; i < categories; i++) {
            weights[i] = sc.nextInt();
        }
        for(int i = 0; i < categories; i++) {
            values[i] = sc.nextInt();
        }
        int[] counts = new int[categories];
        int sum=0;
        for(int i = 0; i < categories; i++) {
            counts[i] = sc.nextInt();
            sum += counts[i];
        }
        int[] allweights = new int[sum];
        int[] allvalues = new int[sum];
        int temp=0;
        for(int i = 0; i < categories; i++) {
            for(int j=temp;j<temp+counts[i];j++) {
                allweights[j] = weights[i];
                allvalues[j] = values[i];
            }
            temp+=counts[i];
        }
        int[] dp=new int[bagsize+1];
        dp[0]=0;
        for(int i=0;i<sum;i++){
            for(int j=bagsize;j>=allweights[i];j--){
                dp[j]=Math.max(dp[j],dp[j-allweights[i]]+allvalues[i]);
            }
        }
        System.out.println(dp[bagsize]);
    }
}

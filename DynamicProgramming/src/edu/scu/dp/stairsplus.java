package edu.scu.dp;

import java.util.Scanner;

public class stairsplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top=sc.nextInt();
        int steps = sc.nextInt();
        int[] dp = new int[top+1];
        dp[0] = 1;
        //dp[1]=1;
        //dp[2]=2;
        for(int i=1;i<=top;i++){
            for(int j=i-1;j>=i-steps&&j>=0;j--){
                dp[i]+=dp[j];
            }
        }
        System.out.println(dp[top]);
    }
}

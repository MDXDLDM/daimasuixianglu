package edu.scu.dp;

public class findlength {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        int res = 0;
        for(int i = 0; i < nums2.length; i++){
            if(nums1[0] == nums2[i]){
                dp[0][i] = 1;
                res=1;
            }
        }
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] == nums2[0]){
                dp[i][0] = 1;
                res=1;
            }
        }
        for(int i = 1; i < nums1.length; i++){
            for(int j = 1; j < nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(dp[i][j]>res)res=dp[i][j];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return res;
    }
}

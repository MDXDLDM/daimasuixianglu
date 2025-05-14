package edu.scu.dp;

public class issubsequence {
    public boolean isSubsequence(String s, String t) {
//        if(t.isEmpty()&&!s.isEmpty())return false;
//        int[][] dp = new int[s.length() + 1][t.length() + 1];
//        //dp[0][0] = 0;
//        for (int i = 1; i <= s.length(); i++) {
//            for (int j = 1; j <= t.length(); j++) {
//                if (s.charAt(i - 1) == t.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                }else{
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//        return dp[s.length()][t.length()] == s.length();
        if(s.isEmpty())return true;
        int count=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(count)==t.charAt(i))count++;
            if(count==s.length())return true;
        }
        return false;
    }
}

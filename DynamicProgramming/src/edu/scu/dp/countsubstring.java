package edu.scu.dp;

public class countsubstring {
    public int countSubstrings(String s) {
//        int[] dp = new int[s.length()];
//        dp[0] = 1;
//        for (int i = 1; i < s.length(); i++) {
//            dp[i]=dp[i-1]+1;
//            for(int j=0;j<i;j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    if(isstring(s.substring(j,i+1)))dp[i]++;
//                }
//            }
//        }
//        return dp[s.length()-1];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result+=getsub(s,i,i);
            result+=getsub(s,i,i+1);
        }
        return result;
    }
    private int getsub(String s,int left,int right) {
        int ret=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            ret++;
            left--;
            right++;
        }
        return ret;
    }
    private boolean isstring(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}

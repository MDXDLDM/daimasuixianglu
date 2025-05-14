package edu.scu.dp;

public class numdistinct {
    public int numDistinct(String s, String t) {
//        int[] dp=new int[t.length()+1];
//        dp[t.length()]=1;
//        char[] ss=s.toCharArray();
//        char[] tt=t.toCharArray();
//        for(int i=s.length()-1;i>=0;i--){
//            for(int j=0;j<t.length();j++){
//                if(ss[i]==tt[j]){
//                    dp[j]=(int)((dp[j]+dp[j+1])%(1e9+7));
//                }
//            }
//        }
//        return dp[0];

        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for(int i=0;i<s.length();i++){
            dp[i][0]=1;
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length()&&j<=i; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i-1][j];
                }else{//不管当前字符匹不匹配都要加上dp[i-1][j],这是dp数组的来时路，当当前字符匹配时，理解
                    //该字符对dp的贡献为这个字符占了一个位，使得是需要除了这个字符以外的匹配就能被算作1次。
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}

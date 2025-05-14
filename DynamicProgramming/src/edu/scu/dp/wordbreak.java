package edu.scu.dp;

import java.util.List;

public class wordbreak {
//    boolean[] assist;
//    public boolean wordBreak(String s, List<String> wordDict) {
//        assist=new boolean[s.length()];
//        for(int i=0;i<s.length();i++) {
//            assist[i] = true;
//        }
//        return judge(s, 0,wordDict);
//    }
//    private boolean judge(String s,int startindex, List<String> wordDict) {
//        if(startindex>=s.length())return true;
//        if(!assist[startindex])return false;
//        for(int i = startindex; i <= s.length(); i++) {
//            if(wordDict.contains(s.substring(startindex, i))){
//                boolean flag=judge(s,i, wordDict);
//                if(flag)return true;
//            }
//        }
//        assist[startindex]=false;
//        return false;
//    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j]==1){
                    if(wordDict.contains(s.substring(j, i))){
                        dp[i]=1;
                        break;
                    }
                }
            }
        }
        return dp[s.length()]==1;
    }
}

package edu.scu.greedy;

import java.util.Arrays;

public class increasedigit {
    public int monotoneIncreasingDigits(int n) {
        if(n>=0&&n<=9)return n;
        String digits=String.valueOf(n);
        char[] chars=digits.toCharArray();
        int index=0;
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]>chars[i+1]){
                index=i;
                break;
            }
            if(i== chars.length-2)return n;
        }
        while(index>0&&chars[index-1]-chars[index]==0){
            index--;
        }
        chars[index]--;
        for(int i=index+1;i<chars.length;i++){
            chars[i]='9';
        }
        if(index==0&&chars[index]=='0')return Integer.parseInt(String.valueOf(chars,1, chars.length-1));
        return Integer.parseInt(String.valueOf(chars));
    }
}

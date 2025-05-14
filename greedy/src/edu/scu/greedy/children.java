package edu.scu.greedy;

import java.util.Arrays;

public class children {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);Arrays.sort(s);
        int firstindex=0;int secondindex=0;
        int count=0;
        while(firstindex<g.length&&secondindex<s.length){
            if(g[firstindex]<=s[secondindex]){
                firstindex++;
                secondindex++;
                count++;
            }else{
                secondindex++;
            }
        }
        return count;
    }
}

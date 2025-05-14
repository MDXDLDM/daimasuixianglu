package edu.scu.greedy;

import java.util.ArrayList;
import java.util.List;

public class partion {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<Integer>();
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']=i;
        }
        int max=hash[s.charAt(0)-'a'];
        int pre=-1;
        for (int i =0; i < s.length(); i++) {
            max=Math.max(max,hash[s.charAt(i)-'a']);
            if(i==max){
                result.add(i-pre);
                pre=i;
            }
        }
        return result;
    }
}

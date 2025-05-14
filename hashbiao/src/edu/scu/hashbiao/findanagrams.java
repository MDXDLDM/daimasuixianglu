package edu.scu.hashbiao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findanagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        if(s.length()<p.length())return result;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int slowindex=0;int fastindex=p.length()-1;
        int count=0;
        while(fastindex<s.length()){

        }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(new findanagrams().findAnagrams(s, p));
    }
}

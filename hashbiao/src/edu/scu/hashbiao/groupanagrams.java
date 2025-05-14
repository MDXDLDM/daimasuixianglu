package edu.scu.hashbiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0;i<strs.length;i++){
            List<String> res=new ArrayList<>();
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(strs[i]);
        }
        for(String s:map.keySet()){
            List<String> list=map.get(s);
            ans.add(list);
        }
        return ans;
    }
}

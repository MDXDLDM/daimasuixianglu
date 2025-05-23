package edu.scu.hashbiao;

import java.util.HashMap;

public class canconstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c:magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c:ransomNote.toCharArray()){
            if(!map.containsKey(c)||map.get(c)==0){
                return false;
            }else{
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}

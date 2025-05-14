package edu.scu.hashbiao;

public class isanagram {
    boolean isAnagram(String a, String b) {
        int[] counts = new int[26];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            counts[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(counts[i] != 0)return false;
        }
        return true;
    }
}

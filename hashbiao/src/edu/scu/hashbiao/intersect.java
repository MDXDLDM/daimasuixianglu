package edu.scu.hashbiao;

import java.util.ArrayList;
import java.util.List;

public class intersect {
    public int[] Intersect(int[] a, int[] b) {
        int[] hash1 = new int[1001];
        for(int i:a){
            hash1[i]++;
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i:b){
            if(hash1[i]>0){
                result.add(i);
                hash1[i]--;
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}

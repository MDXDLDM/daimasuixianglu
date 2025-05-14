package edu.scu.hashbiao;

import java.util.HashSet;

public class intersections {
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> res=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                res.add(b[i]);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}

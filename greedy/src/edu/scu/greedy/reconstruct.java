package edu.scu.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class reconstruct {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0])return o1[1]-o2[1];//第一位相同的情况下小的在前
                return o2[0]-o1[0];//倒序arrays sort大的在前，正常sort是递增
            }
        });
        List<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i < people.length; i++) {
            queue.add(Math.min(queue.size(),people[i][1]),people[i]);
        }
        return queue.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {
        new reconstruct().reconstructQueue(new int[][]{
                {7,0},
                {6,1},
        });
    }
}

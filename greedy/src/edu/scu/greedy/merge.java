package edu.scu.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class merge {
    public int[][] mymerge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])return o1[1] - o2[1];
                return o1[0]-o2[0];
            }
        });
        List<int[]> mergedIntervals = new LinkedList<int[]>();
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] > intervals[i-1][1]) {
                mergedIntervals.add(intervals[i-1]);
            }else{
                intervals[i][0]=intervals[i-1][0];
                intervals[i][1]=Math.max(intervals[i-1][1],intervals[i][1]);
            }
        }
        mergedIntervals.add(intervals[intervals.length-1]);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

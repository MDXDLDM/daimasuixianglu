package edu.scu.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class erase {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])return o2[1] - o1[1];
                return o1[0] - o2[0];
            }
        });
        int temp = 0;
        int count=0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<intervals[temp][1]){
                count++;
                if(intervals[temp][1]>=intervals[i][1]){
                    temp=i;
                }
            }
            else{
                temp=i;
            }
        }
        return count;
    }
}

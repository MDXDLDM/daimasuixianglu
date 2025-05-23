package edu.scu.hashbiao;

import java.util.HashMap;

public class foursumcount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum=nums1[i]+nums2[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                int sum=nums3[i]+nums4[j];
                if(map.containsKey(-sum)){
                    count+=map.get(sum);
                }
            }
        }
        return count;
    }
}

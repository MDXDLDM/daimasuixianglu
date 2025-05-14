package edu.scu.greedy;

import java.util.Arrays;

public class largestsumafter {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(i< nums.length&&nums[i]<0){
            i++;
        }
        int sum=0;
        if(i>=k){
            for(int j=0;j<nums.length;j++){
                if(j<k){
                    sum-=nums[j];
                }else{
                    sum+=nums[j];
                }
            }
        }else{
            int rest=k-i;
            int opre=0;
            if(i==0)opre=nums[0];
            else if(i==nums.length-1)opre=-nums[nums.length-1];
            else opre=Math.min(-nums[i],nums[i+1]);
            for(int j=0;j<nums.length;j++){
                if(j<i){
                    sum-=nums[j];
                }else{
                    sum+=nums[j];
                }
            }
            if(rest%2!=0){
                sum-=opre;
            }
        }
        return sum;
    }
}

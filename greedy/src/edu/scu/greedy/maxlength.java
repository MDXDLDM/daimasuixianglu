package edu.scu.greedy;

public class maxlength {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1)return nums.length;
        int count=0;
        int prediff=0;
        int thisdiff=0;
        for(int i=0;i<nums.length-1;i++){
            thisdiff=nums[i+1]-nums[i];
            if((thisdiff>0&&prediff<=0)||(thisdiff<0&&prediff>=0)){
                count++;
                prediff=thisdiff;
            }

        }
        return count;
    }
}

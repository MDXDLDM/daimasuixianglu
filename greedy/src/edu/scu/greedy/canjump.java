package edu.scu.greedy;

public class canjump {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]==0)return false;
        int i=1;
        int canbe=nums[0];
        while(i<=canbe&&i<nums.length){
            if(canbe>=nums.length-1)return true;
            int temp=nums[i]+i;
            if(temp>canbe){
                canbe=temp;
            }
            i++;
        }
        return false;
    }
}

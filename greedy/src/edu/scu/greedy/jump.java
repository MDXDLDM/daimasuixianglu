package edu.scu.greedy;

public class jump {
    public int Jump(int[] nums){
        if(nums.length == 1)return 0;
        for(int i=0;i< nums.length;i++){
            nums[i]+=i;
        }
        int canbe=nums[0];
        int count=0;
        int start=1;
        while(canbe<nums.length-1){
            int temp=canbe;
            for(int i=start;i<=canbe;i++){
                if(nums[i]>temp){
                    temp=nums[i];
                }
            }
            count++;
            start=canbe+1;
            canbe=temp;
        }
        count++;//canbe覆盖后需要跳最后一步
        return count;
    }
}

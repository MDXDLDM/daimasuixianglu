package edu.scu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteunique {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> Permuteunique(int[] nums) {
        int[] book=new int[nums.length];
        Arrays.sort(nums);
        backtracking(nums,0,book);
        return res;
    }
    private void backtracking(int[] nums,int count,int[] book){
        if(count==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        int temp=0;int flag=0;
        for(int i=0;i<nums.length;i++){
            if(i>0&&flag>0&&nums[i]==temp)continue;
            if(book[i]!=1){
                temp=nums[i];
                flag++;
                book[i]=1;
                path.add(nums[i]);
                backtracking(nums,count+1,book);
                book[i]=0;
                path.remove(path.size()-1);
            }
        }
    }
}

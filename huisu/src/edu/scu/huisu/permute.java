package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class permute {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> Permute(int[] nums) {
        int[] book=new int[nums.length];
        backtracking(nums,0,book);
        return res;
    }
    private void backtracking(int[] nums,int count,int[] book){
        if(count==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(book[i]!=1){
                book[i]=1;
                path.add(nums[i]);
                backtracking(nums,count+1,book);
                book[i]=0;
                path.remove(path.size()-1);
            }
        }
    }
}

package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class findsubsequendes {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsequences(int[] nums) {
        return res;
    }
    private void backtracking(int[] nums,int index){
        if(path.size()>=2){
            res.add(new ArrayList<>(path));
        }
        for(int i=index;i<nums.length;i++){
            if(i>index&&isfind(nums,index,i))continue;
            if(!path.isEmpty()&&i>0&&nums[i]<path.get(path.size()-1))continue;
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
    private boolean isfind(int[] nums,int start,int i){
        for(; start <i; start++){
            if(nums[i]==nums[start])return true;
        }
        return false;
    }
}

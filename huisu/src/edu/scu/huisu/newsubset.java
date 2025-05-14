package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class newsubset {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> newsubsets(int[] nums) {
        backtracking(0,nums);
        return res;
    }
    private void backtracking(int index,int[] nums){
        res.add(new ArrayList<>(path));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1])continue;
            path.add(nums[i]);
            backtracking(i+1,nums);
            path.remove(path.size()-1);
        }
    }
}

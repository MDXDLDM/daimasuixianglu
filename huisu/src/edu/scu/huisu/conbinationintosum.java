package edu.scu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class conbinationintosum {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0,target,candidates,0);
        return res;
    }
    public void dfs(int sum,int target,int[] nums,int index){
        if(sum==target){
            //if(res.contains(path))return;
            res.add(new ArrayList<>(path));
        }else if(index> nums.length||sum>target||nums[index]>target){
            return;
        }
        if(index>0&&index< nums.length&&nums[index]==nums[index-1]){
            dfs(sum,target,nums,index+1);
        }
        for(int i=index;i<nums.length;i++){
            if(sum+nums[i]>target){
                break;
            }
            path.add(nums[i]);
            dfs(sum+nums[i],target,nums,i);//保证寻找下个元素时，不能寻找当前i前面的元素
            path.remove(path.size()-1);//也就是答案中的每个数组都是数递增的
        }
    }
}

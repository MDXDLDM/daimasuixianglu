package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class subset {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return res;
    }

    private void dfs(int index,int[] nums){
        if(res.size()==Math.pow(2,nums.length))return;
        if(index==nums.length&&!res.contains(path)){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<nums.length;i++){
            dfs(i+1,nums);
            path.add(nums[i]);
            dfs(i+1,nums);
            path.remove(path.size()-1);
        }
    }
    private void addafter(int[] nums){
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size=res.size();
            for(int j=0;j<size;j++){
                List<Integer> temp=new ArrayList<>(res.get(j));
                temp.add(nums[i]);//可以做去重处理
                res.add(temp);
            }
        }
    }
    private void newdfs(int[] nums, int startIndex){
        res.add(new ArrayList<>(path));//「遍历这个树的时候，把所有节点都记录下来，就是要求的子集集合」。
        if (startIndex >= nums.length){ //终止条件可不加
            return;
        }
        for (int i = startIndex; i < nums.length; i++){
            path.add(nums[i]);
            newdfs(nums, i + 1);
            path.remove(path.size()-1);
        }
    }
}

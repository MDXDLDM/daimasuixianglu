package edu.scu.hashbiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int j = 0; j < nums.length - 3; j++) {
            int temp = nums[j];
            if(temp>target&&temp>=0)return res;
            if(j>0&&nums[j]==nums[j-1])continue;
            for(int i = j + 1; i < nums.length - 2; i++) {
                //if(nums[i] > target-temp)break;
                if (i > j+1 && nums[i] == nums[i - 1]) continue;
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = temp+nums[i] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(temp,nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new foursum().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -11));
    }
}

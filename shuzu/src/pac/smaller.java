package pac;

import java.util.Arrays;

public class smaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int current = nums[i];
//            int sum = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(j==i)continue;
//                if(current>nums[j]){
//                    sum++;
//                }
//            }
//            result[i] = sum;
//        }
//        return result;
        int[] result = new int[nums.length];
        int[] copy=Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int[] sorted=new int[101];
        for (int i = nums.length - 1; i >= 0; i--) {
            sorted[copy[i]]=i;
        }
        for (int i = 0; i < result.length; i++) {
            result[i]=sorted[nums[i]];
        }
        return result;
    }
}

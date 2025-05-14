package pac;

public class leastson {
    public static int solution(int[] nums,int target){
        int N=100001;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            if(sum<target){
                sum+=nums[right];
            }

            while(sum>=target) {
                N = N > (right - left+1) ? (right - left+1) : N;
                sum -= nums[left];
                left++;
            }
        }
        return N>100000?0:N;
    }
}

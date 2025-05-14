package pac;

public class movezero {
    public static void movezeros(int[] nums){
        int slowindex=0;
        for(int fastindex=0;fastindex<nums.length;fastindex++){
            if(nums[fastindex]!=0){
                nums[slowindex++]=nums[fastindex];
            }
        }
        for(int i=slowindex;i<nums.length;i++){
            nums[i]=0;
        }
    }
}

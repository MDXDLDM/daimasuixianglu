package pac;

import java.util.Arrays;

public class arrnumplus {
    public static int[] getnewarr(int[] test){
        int i=0;
        int j=test.length-1;
        int[] res=new int[test.length];
        while(i<j){
            if(test[i]*test[i]<test[j]*test[j]){
                res[j-i]=test[j]*test[j--];
            }
            else{
                res[j-i]=test[i]*test[i++];
            }
        }
        res[0]=test[i]*test[i];
        return res;
    }

    public static void main(String[] args) {
        int[] exam={-5,-4,-2,-1,0,2,3,4,5,6};
        int[] res=getnewarr(exam);
        System.out.println(Arrays.toString(res));
    }
}

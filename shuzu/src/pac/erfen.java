package pac;

public class erfen {
    public static int midfind(int[] test,int n){
        if(n<test[0]||n>test[test.length-1]){
            return -1;
        }
        else{
            int left=0;
            int right=test.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(test[mid]<n){
                    left=mid+1;
                }
                else if(test[mid]>n){
                    right=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}

package pac;

public class removedup {
    public static int removeDuplicates(int[] arr) {
        int slowindex=1;
        for(int fastindex=1;fastindex<arr.length;fastindex++){
            if(arr[fastindex]!=arr[slowindex-1]){
                arr[slowindex++]=arr[fastindex];
            }
        }
        return slowindex;
    }
}

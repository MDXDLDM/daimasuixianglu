package pac;

public class removenum {
    public static int removenumsolu(int[] test,int val){
        int slowindex=0;
        for(int fastindex=0;fastindex<test.length;fastindex++){
            if(test[fastindex]!=val){
                test[slowindex++]=test[fastindex];
            }
        }
        return slowindex;//length
    }
}

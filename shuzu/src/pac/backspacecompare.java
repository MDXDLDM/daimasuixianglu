package pac;

public class backspacecompare {
    public static boolean solution(String a, String b) {
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!='#'){
                A.append(a.charAt(i));
            }
            else{
                if (A.length()!=0) {
                    A.deleteCharAt(A.length()-1);
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i)!='#'){
                B.append(b.charAt(i));
            }
            else{
                if (B.length()!=0) {
                    B.deleteCharAt(B.length()-1);
                }
            }
        }
        return A.toString().contentEquals(B);
    }

    public static boolean solution2(String a, String b) {
        int aindex=a.length()-1;
        int aflag=0;
        int bindex=b.length()-1;
        int bflag=0;
        while(true){
            while(aindex>=0){
                if(a.charAt(aindex)=='#'){
                    aflag++;
                }
                else{
                    if(aflag>0){
                        aflag--;
                    }
                    else{
                        break;
                    }
                }
                aindex--;
            }
            while(bindex>=0){
                if(b.charAt(bindex)=='#'){
                    bflag++;
                }
                else{
                    if(bflag>0){
                        bflag--;
                    }
                    else{
                        break;
                    }
                }
                bindex--;
            }
            if(aindex<0||bindex<0)break;
            if(a.charAt(aindex)!=b.charAt(bindex))return false;
            aindex--;
            bindex--;
        }
        if(aindex==-1&&bindex==-1)return true;
        else return false;
    }
}

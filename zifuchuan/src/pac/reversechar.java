package pac;

public class reversechar {
    public static void reverseString(char[] s) {
        int len = s.length;
        if(len!=0&&len!=1){
            for(int i=0;i<len/2;i++){
                char temp = s[i];
                s[i] = s[len-1-i];
                s[len-1-i] = temp;
            }
        }
    }
}

package pac;

public class reverse2 {
    public static String reverseStr(String s, int k) {
//        int len = s.length();
//        int round=len/(2*k);
//        int left=len-round*2*k;
//        //StringBuilder sb=new StringBuilder();
//        String res= "";
//        for(int i=0;i<round;i++){
//            for(int j=0;j<k;j++){
//                //sb.append(s.charAt(i*2*k+k-j-1));
//                res+=s.charAt(i*2*k+k-j-1);
//            }
//            for(int j=0;j<k;j++){
//                //sb.append(s.charAt(i*2*k+k+j));
//                res+=s.charAt(i*2*k+k+j);
//            }
//        }
//        if(left<=k){
//            for(int j=0;j<left;j++){
//                //sb.append(s.charAt(len-j-1));
//                res+=s.charAt(len-j-1);
//            }
//        }
//        else{
//            for(int j=0;j<k;j++){
//                //sb.append(s.charAt(round*2*k+k-1-j));
//                res+=s.charAt(round*2*k+k-1-j);
//            }
//            for(int i=len-left+k;i<len;i++){
//                //sb.append(s.charAt(i));
//                res+=s.charAt(i);
//            }
//        }
//        return res;
        int len = s.length();
        int roundall=len/k;
        int left=len-roundall*k;
        if(len==0||len==1){
            return s;
        }
        char[] arr = new char[len];
        for(int i=0;i<len;i++){
            int judge=i/k;
            int diff=judge%2;
            //if(i%k==0)roundall--;
            if(roundall-judge!=0){
                if(diff==0){
                    arr[i]=s.charAt(judge*k-1+k-i%k);
                }
                else{
                    arr[i]=s.charAt(i);
                }
            }
            else{
                if(diff==0){
                    arr[i]=s.charAt(judge*k-1+left-i%k);
                    //left--;
                }
                else{
                    arr[i]=s.charAt(i);
                }
            }
        }
        return new String(arr);
    }
}

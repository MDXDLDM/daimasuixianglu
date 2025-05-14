package pac;
public class stringbysame {
    public static boolean stringBysame(String a){
        StringBuilder sb=new StringBuilder();
        sb.append(a,1,a.length());sb.append(a,0,a.length()-1);
        String s=sb.toString();
        if(KMP.KMPsearch(s,a)!=-1)return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(stringBysame("abcabc"));
    }
}

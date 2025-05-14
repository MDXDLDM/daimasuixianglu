package pac;

public class replacenum {
    public static void replaceNum(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0'&&c<='9'){
                sb.append("number");
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

}

package pac;

public class reversewords {
    public String reverseWords(String s) {
        StringBuilder sb = removespace(s);
        reversestring(sb,0,sb.length()-1);
        reverseeachword(sb);
        return sb.toString();
    }
    private StringBuilder removespace(String s){
        int start=0;
        int end=s.length()-1;
        while(s.charAt(start)==' '){
            start++;
        }
        while(s.charAt(end)==' '&&end>0){
            end--;
        }
        StringBuilder sb=new StringBuilder();
        while(start<=end){
            char ch=s.charAt(start);
            if(ch!=' '||sb.charAt(sb.length()-1)!=' '){
                //此处较为巧妙的是，因为如果添加了空格，那么空格必定在sb的末尾
                //那么判断如果sb末尾为空格的话，就避免了单词间的多个空格，避免了刻意的删除操作
                sb.append(ch);
            }
            start++;
        }
        return sb;
    }
    private void reversestring(StringBuilder sb,int start,int end){
        //此处传递start和end,主要是考虑到后续在翻转每一个单词的时候，代码的复用问题，从而避免了类似方法重复复杂书写
        while(start<end){
            char ch=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,ch);
            start++;
            end--;
        }
    }
    private void reverseeachword(StringBuilder sb){
        int start=0;
        int end=0;
        for(;end<sb.length();end++){
            if(sb.charAt(end)==' '){
                reversestring(sb,start,end-1);
                start=end+1;
            }
        }
        reversestring(sb,start,end-1);
    }

    public static void main(String[] args) {
        String s="the sky is blue";
        reversewords reversewords=new reversewords();
        System.out.println(reversewords.reverseWords(s));
    }
}

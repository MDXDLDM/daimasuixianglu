package pac;

import java.util.Arrays;

public class KMP {
    //获取到next数组
    public static int[] getnext(String s,int[] next){
        next[0] = 0;
        int i=1;
        int len=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                next[i] = len;
                i++;
            }
            else{
                //当前后缀新加进来的字符无法匹配时，不应该直接判定next[i]=0，而是，我们想到，在新增加字符之前，
                //此前的len长度前缀后缀都是可以匹配的，那么，在尽可能避免减少len的情况下，有这样一种想法，
                //将前缀单独拿出来看，对于前缀pre，存在next[len-1]，即前缀中最大重复前后缀，也就是说，新增加字符后，
                //我们需要比较的那一部分，属于前缀中的后缀部分，于是可以想到，我们可以用前缀中的前缀来替代前缀中的后缀部分
                //如abcdabcf，在f和d不等后，我们寻找在前缀<abc>中，是否有next[2]，找到一个前缀中的前缀，来替代如<c>
                //或<bc>，或者说，当B，C部分新增字符不等时，我们找到A部分来替代B，也就是前缀里的最大前缀后缀重复，从而
                //避免了len直接变为0，也就是len=next[len-1]，当len=0时，即在前缀中无法找到非0个的替代，那么next[i]=0
                if(len==0){
                    next[i] = 0;
                    i++;
                }
                else{
                    len=next[len-1];
                }
            }
        }
        //System.out.println(Arrays.toString(next));
        return next;
    }

    public static int KMPsearch(String s,String t){
        int[] next=new int[t.length()];
        next=getnext(t,next);
        int j=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                //System.out.println(i+" "+j);
                i++;j++;
            }
            else{
                if(j==0){
                    //System.out.println("++");
                    i++;
                }
                else{
                    //System.out.println("load");
                    j=next[j-1];
                    //从开头匹配开始，每一次移动都保证了新头等于最初始的头，类似于递归，不需要纠结移动后
                    //字符串最头的一段是否匹配
                }
            }
            if(j==t.length()){
                //System.out.println("call");
                return i-t.length()+1;//此处返回的是第几个字符，若返回下标则不需要+1
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a="mississippi";
        String b="issip";
        System.out.println(KMPsearch(a,b));
    }
}

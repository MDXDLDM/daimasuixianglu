package edu.scu.stackandquene;

import java.util.Stack;

public class removedup {
    public static String removduplicates(String s){
//        Stack<Character> stack = new Stack<Character>();
//        for(int i=0;i<s.length();i++){
//            if(stack.isEmpty()){
//                stack.push(s.charAt(i));
//            }
//            else{
//                if(stack.peek()==s.charAt(i)){
//                    stack.pop();
//                }
//                else{
//                    stack.push(s.charAt(i));
//                }
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while(!stack.isEmpty()){
//            sb.append(stack.pop());
//        }
//        sb.reverse();
//        return sb.toString();
        //双指针
        char[] res =s.toCharArray();
        int slowindex=0;
        int fastindex=0;
        for(;fastindex<s.length();fastindex++){
            res[slowindex]=res[fastindex];
            if(slowindex>0&&res[slowindex]==res[slowindex-1]){
                slowindex--;
            }
            else{
                slowindex++;
            }
        }
        return new String(res,0,slowindex);
    }
}

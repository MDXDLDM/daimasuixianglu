package edu.scu.stackandquene;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class isvalid {
    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            }
//            else{
//                if (stack.isEmpty())return false;//后大于前
//                char judge = stack.pop();
//                if(c==')' && judge=='(')continue;
//                else if(c=='}' && judge=='{')continue;
//                else if(c==']' && judge=='[')continue;
//                return false;
//            }
//        }
//        return stack.isEmpty();//前大于后
        Deque<Character> q = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {q.add(')');}
            else if (c == '{') {q.add('}');}
            else if (c == '[') {q.add(']');}
            else{
                if(q.isEmpty())return false;
                if(c!=q.pollLast())return false;
            }
        }
        return q.isEmpty();
    }
}

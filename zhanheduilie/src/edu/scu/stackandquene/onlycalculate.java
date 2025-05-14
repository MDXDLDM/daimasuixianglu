package edu.scu.stackandquene;

import java.util.Stack;

public class onlycalculate {
    public static int RPN(String[] tokens){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(tokens[i].equals("-")){
                int b = stack.pop();
                stack.push(stack.pop()-b);
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(tokens[i].equals("/")){
                int b = stack.pop();
                stack.push(stack.pop()/b);
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}

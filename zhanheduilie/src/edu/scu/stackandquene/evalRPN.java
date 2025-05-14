package edu.scu.stackandquene;

import java.util.Stack;

public class evalRPN {
    public int EvalRPN(String[] expression) {
        return (calculate(midtoback(expression)));
    }
    private int getpriority(char c){
        if(c=='+'||c=='-')return 1;
        if(c=='*'||c=='/')return 2;
        else return -1;
    }
    private Stack<String> midtoback(String[] expression){
        Stack<String> stack = new Stack<>();
        Stack<String> operators = new Stack<>();
        for(int i=0;i<expression.length;i++){
            if(Character.isDigit(expression[i].charAt(0))||Character.isDigit(expression[i].charAt(expression[i].length()-1))){
                stack.push(expression[i]);
            }
            else{
                if(operators.empty()){
                    operators.push(expression[i]);
                }
                else if(expression[i].equals("(")){
                    operators.push("(");
                }
                else if(expression[i].equals(")")){
                    while(!operators.peek().equals("(")){
                        stack.push(operators.pop());
                    }
                    operators.pop();
                }
                else if(getpriority(expression[i].charAt(0))<=getpriority(operators.peek().charAt(0))){
                    stack.push(operators.pop());
                    operators.push(expression[i]);
                }
            }
        }
        while(!operators.empty()){
            stack.push(operators.pop());
        }
        return stack;
    }
    private int calculate(Stack<String> res){
        Stack<Integer> nums = new Stack<>();
        int size=res.size();
        for(int i=0;i<size;i++){
            if(Character.isDigit(res.get(i).charAt(0))||Character.isDigit(res.get(i).charAt(res.get(i).length()-1))){
                nums.push(Integer.parseInt(res.get(i)));
            }
            else{
                int a = nums.pop();
                int b = nums.pop();
                if(res.get(i).equals("+")){
                    nums.push(a+b);
                }
                else if(res.get(i).equals("-")){
                    nums.push(b-a);
                }
                else if(res.get(i).equals("*")){
                    nums.push(a*b);
                }
                else if(res.get(i).equals("/")){
                    nums.push(b/a);
                }
            }
        }
        return nums.pop();
    }
}

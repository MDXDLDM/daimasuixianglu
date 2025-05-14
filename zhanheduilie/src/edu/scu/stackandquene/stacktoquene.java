package edu.scu.stackandquene;

import java.util.Stack;

public class stacktoquene {
    Stack<Integer> stackin;
    Stack<Integer> stackout;
    public stacktoquene(){
        stackin=new Stack<>();
        stackout=new Stack<>();
    }
    public void push(int x){
        stackin.push(x);
    }
    public int pop(){
        intoout();
        return stackout.pop();
    }
    public int peek(){
        intoout();
        return stackout.peek();
    }
    public boolean Empty(){
        return stackin.isEmpty() && stackout.isEmpty();
    }
    public void intoout(){
        if(!stackout.isEmpty()){return;}
        while(!stackin.isEmpty()){
            stackout.push(stackin.pop());
        }
    }

    public static void main(String[] args) {
        stacktoquene ts=new stacktoquene();
        ts.push(1);
        ts.push(2);
        System.out.println(ts.peek());
        ts.push(3);
        System.out.println(ts.peek());
    }
}

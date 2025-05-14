package edu.scu.stackandquene;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class dandiaoqueue {
    Deque<Integer> deque;
    public dandiaoqueue() {
        deque = new LinkedList<Integer>();
    }
    public void push(int x){
        while(!deque.isEmpty()&&x>deque.getLast()){
            deque.removeLast();
        }
        deque.addLast(x);
    }
    public void poll(int x){
        if(!deque.isEmpty()&&x==deque.peek()){
            deque.pollFirst();
        }
    }
    public int peek(){
        if(!deque.isEmpty())return deque.peek();
        else return -1;//error
    }
    public static int[] sliding(int[] nums,int k){
        if(nums.length==0||nums.length==1||k==1){
            return nums;
        }
        dandiaoqueue queue = new dandiaoqueue();
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            queue.push(nums[i]);
        }
        res[0]=queue.peek();
        for(int i=k;i<nums.length;i++){
            queue.poll(nums[i-k]);
            queue.push(nums[i]);
            res[i-k+1]=queue.peek();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9,10,9,-7,-4,-8,2,-6};
        int k=5;
        System.out.println(Arrays.toString(sliding(nums,k)));
    }
}

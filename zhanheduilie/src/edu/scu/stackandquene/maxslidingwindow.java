package edu.scu.stackandquene;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class maxslidingwindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int max=nums[0];
        if(nums.length<=k){
            for(int i=1; i<nums.length; i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            result[0] = max;
            return result;
        }
        if(k==1)return nums;
        int secmax=nums[k-1];
        for(int i=0;i<k;i++){
            deque.addLast(nums[i]);
        }
        for(int i=1;i<k;i++){
            if(nums[i]>=max){
                secmax=max;
                max=nums[i];
            }
        }
        //System.out.println(max);
        result[0] = max;
        for(int i=k;i<nums.length;i++){
            deque.addLast(nums[i]);
            int temp=deque.pollFirst();
            if(nums[i]>=max){
                if(temp!=max){
                    secmax=max;
                }
                max=nums[i];
            }
            else{
                if(temp==max){
                    //System.out.println(secmax+" "+i);
                    if(nums[i]>=secmax){
                        max=nums[i];
                    }
                    else{
                        //System.out.println("secmax"+secmax);
                        max=secmax;
                        secmax=getsecmax(deque,max);
                    }
                }
                else{
                    if(nums[i]>=secmax){
                        secmax=nums[i];
                    }
                }
            }
            result[i-k+1]=max;
        }
        return result;
    }
    public static int getsecmax(Deque<Integer> deque,int M){
        //System.out.println("call "+M);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<deque.size();i++){
            if(max<deque.peek()&&deque.peek()!=M){

                max=deque.peek();
                //System.out.println("update"+max);
            }
            deque.addLast(deque.pollFirst());
        }
        //System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] nums={-6,-10,-7,-1,-9,9,-8,-4,10,-5,2,9,0,-7,7,4,-2,-10,8,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 7)));
    }
}

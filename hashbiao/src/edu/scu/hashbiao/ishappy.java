package edu.scu.hashbiao;

import java.util.HashSet;

public class ishappy {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        while(n!=1){
            int temp=0;
            while(n>0){
                temp+=(int)Math.pow(n%10,2);
                n=n/10;
            }
            if(set.contains(temp)){
                return false;
            }
            set.add(temp);
            n=temp;
        }
        return true;
    }
    private int getsum(int n){
        int sum=0;
        while(n>0){
            sum+=(int)Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
}

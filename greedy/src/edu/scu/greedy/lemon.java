package edu.scu.greedy;

public class lemon {
    public boolean lemonadeChange(int[] bills) {
        int five=0;int ten=0;
        int i=0;
        while(i<bills.length){
            int temp=bills[i];
            if(temp==5){
                five++;
            }
            if(temp==10){
                ten++;
            }
            int rest=temp-5;
            while(rest>=10&&ten>0){
                rest-=10;
                ten--;
            }
            while(rest>=5&&five>0){
                rest-=5;
                five--;
            }
            if(rest>0)return false;
            i++;
        }
        return true;
    }
}

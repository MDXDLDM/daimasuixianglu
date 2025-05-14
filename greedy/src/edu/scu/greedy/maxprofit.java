package edu.scu.greedy;

public class maxprofit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int has=0;
        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i+1]) {
                if(has==0){
                    has=1;
                    profit-=prices[i];
                }
            }else{
                if(has==1){
                    has=0;
                    profit+=prices[i];
                }
            }
        }
        if(has==1){
            profit+=prices[prices.length-1];
        }
        return profit;
    }
}

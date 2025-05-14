package edu.scu.greedy;

public class cancomplete {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int all=0;int rest=0;int tempindex=0;
        for(int i=0;i<gas.length;i++){
            rest+=gas[i]-cost[i];
            all+=gas[i]-cost[i];
            if(rest<0){
                tempindex=(i+1)%gas.length;
                rest=0;
            }
        }
        if(all<0){
            return -1;
        }
        return tempindex;
    }
}

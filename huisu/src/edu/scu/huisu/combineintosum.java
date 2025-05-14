package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class combineintosum {
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<>();
    List<List<Integer>> Combinesum(int k,int sum){
        com2(1,k,sum);
        return list;
    }
    void com2(int start,int k,int sum){
        if(start>10)return;
        if(path.size()==k){
            if(sum==0){
                list.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i=start;i<=9-(k-path.size())+1;i++){
            path.add(i);
            com2(i+1,k,sum-i);
            path.remove(path.size()-1);
        }
    }
}

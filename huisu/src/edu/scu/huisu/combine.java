package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class combine {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<>();
    List<List<Integer>> Combine(int n, int k) {
        com(1,n,k);
        return list;
    }
    void com(int start,int n,int k){
        if(path.size()==k){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<=n-(k-path.size())+1;i++){
            path.add(i);
            com(i+1,n,k);
            path.remove(path.size()-1);
        }
    }
}

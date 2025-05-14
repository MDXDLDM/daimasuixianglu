package edu.scu.tulun;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class allpath {
    static int count=0;
    static LinkedList<Integer> path = new LinkedList<>();
    static HashMap<Integer, LinkedList<Integer>> map=new HashMap<Integer,LinkedList<Integer>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes=sc.nextInt();
        int edges=sc.nextInt();
        for(int i=0;i<edges;i++){
            int src=sc.nextInt();
            int dest=sc.nextInt();
            if(!map.containsKey(src)){
                LinkedList<Integer> temp=new LinkedList<>();
                temp.add(dest);
                map.put(src,temp);
            }else{
                map.get(src).add(dest);
            }
        }
        path.add(1);
        dfs(1,nodes);
        if(count==0) System.out.println(-1);
    }
    private static void dfs(int nodevalue,int dest){
        if(nodevalue==dest){
            for(int i=0;i<path.size()-1;i++){
                System.out.print(path.get(i)+" ");
            }
            System.out.println(dest);
            count++;
            return;
        }
        if(!map.containsKey(nodevalue))return;
        for(int i=0;i<map.get(nodevalue).size();i++){
            path.add(map.get(nodevalue).get(i));
            dfs(map.get(nodevalue).get(i),dest);
            path.removeLast();
        }
    }
}

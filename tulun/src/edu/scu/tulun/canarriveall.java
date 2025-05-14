package edu.scu.tulun;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class canarriveall {
    private static HashMap<Integer, LinkedList<Integer>> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes=sc.nextInt();
        int edges=sc.nextInt();
        for(int i=0;i<edges;i++){
            int src=sc.nextInt();
            int dest=sc.nextInt();
            if(map.containsKey(src)){
                map.get(src).add(dest);
            }else{
                LinkedList<Integer> list=new LinkedList<>();
                list.add(dest);
                map.put(src,list);
            }
        }
        int[] visited=new int[nodes];
        dfs(1,visited);
        for(int i=0;i<nodes;i++){
            if(visited[i]==0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(1);
    }
    private static void dfs(int src,int[] visited){
        if(visited[src-1]==1){
            return;
        }
        visited[src-1]=1;
        if(!map.containsKey(src)) return;
        for(int i=0;i<map.get(src).size();i++){
            int dest=map.get(src).get(i);
            dfs(dest,visited);
        }
    }
}

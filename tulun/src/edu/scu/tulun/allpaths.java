package edu.scu.tulun;

import java.util.LinkedList;
import java.util.List;

public class allpaths {
    List<List<Integer>> allpaths=new LinkedList<List<Integer>>();
    List<Integer> path=new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        path.add(0);
        dfs(0, graph.length-1, graph);
        return allpaths;
    }
    private void dfs(int src,int dest,int[][] graph){
        if(src==dest){
            System.out.println("in");
            List<Integer> list=new LinkedList<>(path);
            allpaths.add(list);
            return;
        }
        for(int i=0;i<graph[src].length;i++){
            path.add(graph[src][i]);
            dfs(graph[src][i],dest,graph);
            path.remove(path.size()-1);
        }
    }
}

package edu.scu.tulun;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class buildmaxisland {
    private static int[][] pos={{1,0},{0,1},{-1,0},{0,-1}};
    private static int islandsize=0;
    private static int mark=2;
    private static void dfs(int x,int y,int[][] visited,int[][] matrix,int[][] grid){
        if(x<0 || y<0 || x>=matrix.length || y>=matrix[0].length)return;
        if(visited[x][y]==1||matrix[x][y]==0)return;
        visited[x][y]=1;
        grid[x][y]=mark;
        islandsize++;
        for(int i=0;i<pos.length;i++){
            int newx=x+pos[i][0];
            int newy=y+pos[i][1];
            dfs(newx,newy,visited,matrix,grid);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        int[][] visited=new int[rows][cols];
        int[][] grid=new int[rows][cols];
        HashMap<Integer,Integer> island=new HashMap<>();
        HashSet<Integer> next=new HashSet<>();
        int res=1;boolean all=true;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==1){
                    islandsize=0;
                    dfs(i,j,visited,matrix,grid);
                    island.put(mark,islandsize);
                    mark++;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    all=false;
                    next.clear();
                    int temp=1;
                    for(int k=0;k<pos.length;k++){
                        int newx=i+pos[k][0];
                        int newy=j+pos[k][1];
                        if(newx>=0 && newx<rows && newy>=0 && newy<cols){
                            if(island.containsKey(grid[newx][newy])&&!next.contains(grid[newx][newy])){
                                next.add(grid[newx][newy]);
                                temp+=island.get(grid[newx][newy]);
                            }
                        }
                    }
                    res=Math.max(res,temp);
                }
            }
        }
        if(all) System.out.println(cols*rows);
        else System.out.println(res);
    }
}

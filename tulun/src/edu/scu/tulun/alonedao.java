package edu.scu.tulun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class alonedao {
    public static int[][] pos={{1,0},{0,1},{-1,0},{0,-1}};
    public static int res=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int[][] visited = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1&&visited[i][j]==0){
                    visited[i][j]=1;
                    bfs(i,j,visited,matrix);
                }
            }
        }
        System.out.println(res);
    }
    private static void bfs(int x, int y, int[][] visited,int[][] matrix) {
        boolean flag=true;
        if(x==0||y==0||x==matrix.length-1||y==matrix[0].length-1)flag=false;
        int temp=1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = 1;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int newx=now[0]+pos[i][0];
                int newy=now[1]+pos[i][1];
                if(newx>=0&&newy>=0&&newx<matrix.length&&newy<matrix[0].length&&matrix[newx][newy]==1&&visited[newx][newy]==0){
                    visited[newx][newy]=1;
                    temp++;
                    if(newx==0||newy==0||newx==matrix.length-1||newy==matrix[0].length-1)flag=false;
                    q.add(new int[]{newx,newy});
                }
            }
        }
        if(flag)res+=temp;
    }
}

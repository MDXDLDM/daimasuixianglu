package edu.scu.tulun;

import java.util.Scanner;

public class dao {
    public static int[][] pos={{1,0},{0,1},{-1,0},{0,-1}};
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
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1&&visited[i][j]==0){
                    visited[i][j]=1;
                    result++;
                    dfs(i,j,visited,matrix);
                }
            }
        }
        System.out.println(result);
    }
    private static void dfs(int x,int y,int[][] visited,int[][] matrix){
        for(int i=0;i<4;i++){
            int newx = pos[i][0]+x;
            int newy = pos[i][1]+y;
            if(newx>=0&&newy>=0&&newx<matrix.length&&newy<matrix[0].length&&matrix[newx][newy]==1&&visited[newx][newy]==0){
                visited[newx][newy]=1;
                dfs(newx,newy,visited,matrix);
            }
        }
    }
}

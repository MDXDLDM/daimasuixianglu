package edu.scu.tulun;

import java.util.Scanner;

public class downdao {
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
        for(int i=0;i<rows;i++){
            if(visited[i][0]==0&&matrix[i][0]==1) dfs(i,0,visited,matrix);
        }
        for(int i=0;i<cols;i++){
            if(visited[0][i]==0&&matrix[0][i]==1)dfs(0,i,visited,matrix);
        }
        for(int i=0;i<rows;i++){
            if(visited[i][cols-1]==0&&matrix[i][cols-1]==1)dfs(i,cols-1,visited,matrix);
        }
        for(int i=0;i<cols;i++){
            if(visited[rows-1][i]==0&&matrix[rows-1][i]==1)dfs(rows-1,i,visited,matrix);
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==2){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    private static void dfs(int x,int y,int[][] visited,int[][] matrix){
        visited[x][y]=1;
        matrix[x][y]=2;
        for(int i=0;i<pos.length;i++){
            int newx = x+pos[i][0];
            int newy = y+pos[i][1];
            if(newx>=0&&newy>=0&&newx<matrix.length&&newy<matrix[0].length&&matrix[newx][newy]==1&&visited[newx][newy]==0){
                dfs(newx,newy,visited,matrix);
            }
        }
    }
}

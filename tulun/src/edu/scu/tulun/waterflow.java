package edu.scu.tulun;

import java.util.Scanner;

public class waterflow {
//    public static int[][] pos={{1,0},{0,1},{-1,0},{0,-1}};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int[][] matrix = new int[rows][cols];
//        int[][] visited = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if(dfs(i,j,visited,matrix)) System.out.println(i+" "+j);
//            }
//        }
//    }
//    private static boolean dfs(int x,int y,int[][] visited,int[][] matrix){
//        if(x==0||y==0||x==matrix.length-1||y==matrix[0].length-1)return true;
//        visited[x][y]=1;
//        boolean flag1=false;boolean flag2=false;
//        for(int i=0;i<2;i++){
//            int newx=x+pos[i][0];
//            int newy=y+pos[i][1];
//            if(visited[newx][newy]==0&&matrix[x][y]>=matrix[newx][newy]){
//                flag1=flag1||dfs(newx,newy,visited,matrix);
//            }
//        }
//        for(int i=2;i<4;i++){
//            int newx=x+pos[i][0];
//            int newy=y+pos[i][1];
//            if(visited[newx][newy]==0&&matrix[x][y]>=matrix[newx][newy]){
//                flag2=flag2||dfs(newx,newy,visited,matrix);
//            }
//        }
//        visited[x][y]=0;
//        return flag1&&flag2;
//    }
    private static void dfs(int x,int y,int[][] visited,int[][] matrix,int pre){
        if(x<0 || y<0 || x>matrix.length-1 || y>matrix[0].length-1)return;
        if(visited[x][y]==1)return;
        if(matrix[x][y]>=pre){
            visited[x][y]=1;
            dfs(x+1,y,visited,matrix,matrix[x][y]);
            dfs(x,y+1,visited,matrix,matrix[x][y]);
            dfs(x-1,y,visited,matrix,matrix[x][y]);
            dfs(x,y-1,visited,matrix,matrix[x][y]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] firstvisited = new int[rows][cols];
        int[][] secondvisited = new int[rows][cols];
        for(int i=0;i<rows;i++){
            dfs(i,0,firstvisited,matrix,Integer.MIN_VALUE);
            dfs(i,cols-1,secondvisited,matrix,Integer.MIN_VALUE);
        }
        for(int i=0;i<cols;i++){
            dfs(0,i,firstvisited,matrix,Integer.MIN_VALUE);
            dfs(rows -1,i,secondvisited,matrix,Integer.MIN_VALUE);
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(firstvisited[i][j]==1&&secondvisited[i][j]==1){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

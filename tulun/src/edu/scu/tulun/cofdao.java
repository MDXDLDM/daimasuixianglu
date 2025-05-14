package edu.scu.tulun;

import java.util.Scanner;

public class cofdao {
    private static int count=0;
    private static int[][] pos={{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==1){
                    count+=4;
                    for(int k=0;k< pos.length;k++){
                        int newx=i+pos[k][0];
                        int newy=j+pos[k][1];
                        if(newx<0||newx>=rows||newy<0||newy>=cols)continue;
                        if(matrix[newx][newy]==1)count--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

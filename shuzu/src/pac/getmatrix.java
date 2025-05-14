package pac;

import java.util.ArrayList;
import java.util.List;

public class getmatrix {
    public static int[][] generateMatrix(int n) {
        int count=1;
        int N=n;
        int[][] matrix=new int[N][N];
        while(n>0){
            if(n==1){
                matrix[N/2][N/2]=N*N;
                break;
            }
            int side=(N-n)/2;//side,side初始x,y
            for(int i=side;i<N-side-1;i++){
                matrix[side][i]=count++;
            }
            for(int i=side;i<N-side-1;i++){
                matrix[i][N-side-1]=count++;

            }
            for(int i=N-side-1;i>side;i--){
                matrix[N-side-1][i]=count++;
            }
            for(int i=N-side-1;i>side;i--){
                matrix[i][side]=count++;
            }
            n-=2;
        }
        return matrix;
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int y=matrix.length;
        int x=matrix[0].length;
        int loop=0;
        while(true){
            if(x-loop*2==1){
                for(int i=loop;i<=y-loop-1;i++){
                    list.add(matrix[i][x-loop-1]);
                }
                break;
            }
            if(y-loop*2==1){
                for(int i=loop;i<=x-loop-1;i++){
                    list.add(matrix[loop][i]);
                }
                break;
            }
            for(int i=loop;i<x-loop-1;i++){
                list.add(matrix[loop][i]);
            }
            for(int i=loop;i<y-loop-1;i++){
                list.add(matrix[i][x-loop-1]);
            }
            for(int i=x-loop-1;i>loop;i--){
                list.add(matrix[y-loop-1][i]);
            }
            for(int i=y-loop-1;i>loop;i--){
                list.add(matrix[i][loop]);
            }
            loop++;
            if(Math.min(x,y)%2==0&&loop*2==Math.min(x,y))break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}

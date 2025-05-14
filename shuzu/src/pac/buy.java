package pac;

import java.util.Scanner;

public class buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] nums=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int result=Integer.MAX_VALUE;
        int[] row=new int[a];
        int[] col=new int[b];
        for(int i=0;i<a;i++){
            if(i>0)row[i]+=row[i-1];
            for(int j=0;j<b;j++){
                row[i]+=nums[i][j];
            }
        }
        for(int i=0;i<b;i++){
            if(i>0)col[i]+=col[i-1];
            for(int j=0;j<a;j++){
                col[i]+=nums[j][i];
            }
        }
        for(int i=0;i<a-1;i++){
            int k=Math.abs(row[a-1]-row[i]*2);
            if(k<result){
                result=k;
            }
        }
        for(int i=0;i<b-1;i++){
            int k=Math.abs(col[b-1]-col[i]*2);
            if(k<result){
                result=k;
            }
        }
        System.out.println(result);
    }
}

package pac;

import java.util.Scanner;

public class lensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==0)p[i]=arr[i];
            else{
                p[i]=p[i-1]+arr[i];
            }
        }
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0) System.out.println(p[b]);
            else System.out.println(p[b]-p[a-1]);
        }
    }
}

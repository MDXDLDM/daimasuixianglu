package pac;

import java.util.Scanner;

public class rightreverse {
    public static String rightReverse(String str,int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(str.length()-k));
        sb.append(str, 0, str.length()-k);
        return sb.toString();//也可以不使用substring而是采用整体翻转再局部翻转的方法
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(rightReverse(str,k));
    }
}

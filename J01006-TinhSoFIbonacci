package codeptit;

import java.util.Scanner;


public class CodePtit {

    public static Scanner ip = new Scanner(System.in);
    public static long fibo(int n) {
        long f1 = 1, f2 = 0, f = 0;
        for(int i=1; i < n;++i) {
            f = f1 + f2;
            f2 = f1;
            f1 = f;
        }
        return f;
    }
        
    public static void main(String[] args) {
       int n,t;
       t = ip.nextInt();
       while(t-->0) {
           n = ip.nextInt();
           System.out.println(fibo(n));
       }
    }
}

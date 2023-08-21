package codeptit;

import java.util.Scanner;


public class CodePtit {
    public static Scanner ip = new Scanner(System.in);
    
    public static boolean check(long n) {
        long f=0, f1=1, f2=0;
        while(f2<n) {
            f = f1 + f2;
            f2 = f1;
            f1 = f;
        }
        if(f2 == n) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int t;
        long n;
        t = ip.nextInt();
        while(t-->0) {
            n = ip.nextLong();
            if (check(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

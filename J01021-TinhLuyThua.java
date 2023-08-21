package codeptit;

import java.util.Scanner;


public class CodePtit {
    public static Scanner ip = new Scanner(System.in);
    public static final long MOD = (long)1e9+7;
    public static long poww(long n, long k) {
        if(k==0) {
            return 1;
        }
        if(k==1) {
            return n % MOD;
        }
        long x=poww(n,k/2);
        long y=(x*x) % MOD;
        if(k%2==0) {
            return y;
        }
        return (n*y) % MOD;
    }
    
    
    public static void main(String[] args) {
          long a,b;
          while(1>0) {
              a = ip.nextLong();
              b = ip.nextLong();
              if(a==0&&b==0) {
                  break;
              }
              else{
                  System.out.println(poww(a,b));
              }
          }
    }
}

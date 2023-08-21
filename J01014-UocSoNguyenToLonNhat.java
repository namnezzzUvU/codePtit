package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static boolean isPrime(Long n) {
        for(int i=2;i<=Math.sqrt(n);++i) {
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static Long findMaxPrime(Long n) {
        long max=0L;
        for(int i = 2;i<=Math.sqrt(n);) {
            if(n%i==0) {
                if(isPrime((long)i)) {
                    max = (long)i;
                }
                if(isPrime((long)n/i)) {
                        max=n/i;
                }
                n/=i;
            }
            else{
                ++i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
       int t;
       t = ip.nextInt();
       long n;
       while(t-->0) {
           n = ip.nextLong();
           if(isPrime(n)) {
               System.out.println(n);
               continue;
           }
           System.out.println(findMaxPrime(n));
       }
    }
}

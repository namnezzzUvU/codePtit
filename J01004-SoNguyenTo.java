package codeptit;

import java.util.Scanner;


public class CodePtit {

    public static Scanner ip = new Scanner(System.in);
    
    public static boolean isPrime(Long n) {
        if(n==1||n==0) return false;
        for(int i=2;i<=Math.sqrt(n);++i) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
       Long n,t;
       t = ip.nextLong(); 
       while(t>0) {
       t--;
       n = ip.nextLong();
       if(isPrime(n)) {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
       }
    }
}

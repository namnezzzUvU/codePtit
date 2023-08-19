package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static Long count(Long n) {
        Long cnt = 0L, temp = 1L;
        for(Long i = 1L; i <= Math.sqrt(n) ; ++i) {
            if(n%i==0) {
                if(i%2==0) {
                    ++cnt;
                }
                temp = n / i;
                if(temp%2 == 0 && temp != Math.sqrt(n)) {
                    ++cnt;
                }
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
       int t;
       t = ip.nextInt();
       Long n;
       while(t-->0) {
           n = ip.nextLong();
           System.out.println(count(n));
       }
    }
}

package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static long caculate(long n) {
        long temp=1,sum=1;
        for(long i = 2; i <= n; ++i) {
            temp*=i;
            sum+=temp;
        }
        return sum;
    }
    
    public static void main(String[] args) {
       long n;
       n = ip.nextLong();
        System.out.println(caculate(n));
    }
}

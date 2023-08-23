package codeptit;



import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static int[] arr = new int[101];
    
    public static long GCD(long a, long b) {
        long tmp;
        while(b!=0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long LCM(long a,long b) {
        return (a*b)/GCD(a,b);
    }
    public static void main(String[] args) {
        int t,n;
        t = ip.nextInt();
        while(t-->0) {
            long tich = 1;
            n = ip.nextInt();
            for(long i=2L;i<=n;++i) {
                tich = LCM(tich,i);
            }
            System.out.println(tich);
        }
    }
}

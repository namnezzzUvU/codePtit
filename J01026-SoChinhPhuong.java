package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t,n;
        double j;
        t = ip.nextInt();
        while(t-->0) {
            n = ip.nextInt();
            j = Math.sqrt(n);
            int tmp = (int)j;
            if(tmp*tmp==n) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

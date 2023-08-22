package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static int[] arr = new int[1000];
    
    public static String check(int n) {
        for(int i=0;i<n/2;++i) {
            if(arr[i]!=arr[n-i-1]) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        int t,n;
        t = ip.nextInt();
        while(t-->0) {
            n = ip.nextInt();
            for(int i=0;i<n;++i) {
                arr[i] = ip.nextInt();
            }
            System.out.println(check(n));
        }
    }
}

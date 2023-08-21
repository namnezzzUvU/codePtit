package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static void prime(long n) {
        int i = 2, cnt = 0, flag = -1;
        while(i>0) {
            if(n==1)  {
                System.out.println(flag + "(" + cnt +") ");
                break;
            }
            if(n%i != 0) {
                if(flag == i) {
                    System.out.printf(flag + "(" + cnt +") ");
                }
                ++i;
                cnt = 0;
                continue;
            }
            n/=i;
            flag = i;
            ++cnt;
        }
    }
    
    public static void main(String[] args) {
        int t,temp;
        t = ip.nextInt();
        temp = t;
        while(t-->0) {
        long n;
        n = ip.nextLong();
        System.out.printf("Test " + (temp - t) + ": ");
        prime(n);
        }
    }
}

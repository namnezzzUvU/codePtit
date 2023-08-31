/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;





import java.math.BigInteger;
import java.util.Scanner;



public class JavaClass {  
    
    public static Scanner ip = new Scanner(System.in);
    public static int[] c = new int[10000];
    public static void xuLy() {
        int cnt = 2;
        for(int i=65;i<=79;) {
            c[i] = cnt;
            ++i;
            c[i] = cnt;
            ++i;
            c[i] = cnt;
            ++cnt;
            ++i;
        }
        for(int i = 80; i<=83; ) {
            c[i] = cnt;
            ++i;
        }
        ++cnt;
        c[84] = cnt;
        c[85] = cnt;
        c[86] = cnt;
        ++cnt;
         for(int i = 87; i<=90; ) {
            c[i] = cnt;
            ++i;
        }
    }
    
    public static void main(String[] args) {
        xuLy();
       int t = ip.nextInt();
       ip.nextLine();
       while(t-->0) {
           String s;
           int flag = 0;
           s = ip.nextLine();
           s = s.toUpperCase();
           for(int i=0; i< s.length()/2; ++i) {
                int tmp = (int) s.charAt(i);
                int tmp2 = (int) s.charAt(s.length()-i-1);
                if(c[tmp] != c[tmp2]) {
                    flag = 1;
                    System.out.println("NO");
                    break;
                }
           }
           if(flag == 0) {
               System.out.println("YES");
           }
       }
    }
}
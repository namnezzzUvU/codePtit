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
    public static void xuLy(String s) {
        int cntLe = 0, cntChan = 0;
        if(s.charAt(0)=='0') {
            System.out.println("INVALID");
            return;
        }
        for(int i = 0; i<s.length();++i) {
            if(s.charAt(i)<'0' || s.charAt(i)>'9') {
                System.out.println("INVALID");
                return;
            }
            int z = s.charAt(i) - '0';
            if(z%2==0) {
                ++cntChan;
            }
            else {
                ++cntLe;
            }
        }
        if(s.length()%2==0) {
            if(cntChan>cntLe) {
                System.out.println("YES");
                return;
            }
        }
        else {
            if(cntLe>cntChan) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    
    public static void main(String[] args) {
       int t = ip.nextInt();
       ip.nextLine();
       while(t-->0) {
           String s;
           s = ip.nextLine();
           xuLy(s);;
       } 
    }
}

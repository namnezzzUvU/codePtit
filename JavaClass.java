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
       int cnt = 0;
       int len = s.length();
       for(int i=0; i<len/2;++i) {
           if(s.charAt(i) != s.charAt(len - i - 1)){
               ++cnt;
           }
       }
       if(cnt > 1) {
           System.out.println("NO");
       }
       else if(cnt==0) {
           if(len%2==0) {
               System.out.println("NO");
           }
           else {
               System.out.println("YES");
           }
       }
       else {
           System.out.println("YES");
       }
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
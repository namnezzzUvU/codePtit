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
   
    
    public static void main(String[] args) {
       int t = ip.nextInt();
       ip.nextLine();
       while(t-->0) {
           String s,s2;
           s = ip.nextLine();
           s2 = ip.nextLine();
           if(s.equals(s2)) {
               System.out.println(-1);
               continue;
           }
           if(s.length() > s2.length()) {
               System.out.println(s.length());
           }
           else if(s.length() <= s2.length()) {
               System.out.println(s2.length());
           }
       } 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;


public class JavaClass {  
    
   public static void kiemTra(String s) {
       for(int i=0; i<s.length();++i) {
           int tmp = (int) s.charAt(i) - '0';
           if(tmp % 2!=0) {
               System.out.println("NO");
               return;
           }
           if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
               System.out.println("NO");
               return;
           }
       }
       System.out.println("YES");
   }
    
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0) {
            String s = ip.nextLine();
            kiemTra(s);
        }
    }
}

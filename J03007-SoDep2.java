/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;


public class JavaClass {  
    
   public static String kiemTra(String s) {
       if(s.charAt(0) - '0' != 8 || s.charAt(s.length()-1)-'0' != 8) {
           return "NO";
       }
       int tmp = 0;
       for(int i=0; i<s.length()/2;++i) {
           if(s.charAt(i) != s.charAt(s.length() - i - 1) ) {
               return "NO";
           }
               int temp = (int) (s.charAt(i)-'0')*2;
               tmp += temp;
       }
       if(tmp%10!=0) {
           return "NO";
       }
       return "YES";
   }
    
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0) {
            String s = ip.nextLine();
            System.out.println(kiemTra(s));
        }
    }
}

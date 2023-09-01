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
        int flag = 0;
        String str = ip.nextLine();
          while(flag == 0) {
               int tmp = 0;
               StringBuilder s = new StringBuilder(str);
               for(int i = 0; i<s.length()-1;++i) {
                   if(s.charAt(i)==s.charAt(i+1)) {
                       ++tmp;
                       s.setCharAt(i, '~');
                       s.setCharAt(i+1, '~');
                   }
               }
               str = s.toString();
               str = str.replace("~", "");
               if(tmp==0) {
                   flag = 1;
               }
          }
        if(str.length()==0) {
            System.out.println("Empty String");
        }
        else {
            System.out.println(str);
        }
    } 
}

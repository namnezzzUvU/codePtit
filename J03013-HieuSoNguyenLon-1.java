
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;



public class JavaClass {  
    
    public static Scanner ip = new Scanner(System.in);
   
    
    
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-->0) {
            BigInteger s1 = ip.nextBigInteger();
            BigInteger s2 = ip.nextBigInteger();
            if(s1.compareTo(s2)==-1) {
                String s = s2.toString();
                int size = s.length();
                s = s2.subtract(s1).toString();
                int size2 = Math.abs(s.length()- size);
                while(size2>0) {
                    System.out.print('0');
                    --size2;
                }
                System.out.println(s);
            }
            else {
                String s = s1.toString();
                int size = s.length();
                s = s1.subtract(s2).toString();
                int size2 = Math.abs(s.length()- size);
                while(size2>0) {
                    System.out.print('0');
                    --size2;
                }
                System.out.println(s);
            }
        }
    }
}

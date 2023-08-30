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
            BigInteger s3 = s1.multiply(s2);
            BigInteger s4 = s1.gcd(s2);
            System.out.println(s4);
        }
    }
}

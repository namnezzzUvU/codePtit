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
    
    public static void main(String[] args) {
        BigInteger s1 = ip.nextBigInteger();
        BigInteger s2 = ip.nextBigInteger();
        System.out.println(s1.subtract(s2));
    }
}
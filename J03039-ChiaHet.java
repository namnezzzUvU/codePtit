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
        BigInteger zero = new BigInteger("0");
        while(t-->0) {
            BigInteger s1 = ip.nextBigInteger();
            BigInteger s2 = ip.nextBigInteger();
            BigInteger s3 = s1.mod(s2);
            BigInteger s4 = s2.mod(s1);
            if(s3.equals(zero) || s4.equals(zero)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    } 
}

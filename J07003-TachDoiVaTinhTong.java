/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;


public class JavaClass {
    public static void main(String[] args) throws Exception
    {
        File file = new File("DATA.in");
        Scanner ip = new Scanner(file);
        String s = ip.next();
        while(true) {
            String s1 = s.substring(0,(int) s.length()/2);
            String s2 = s.substring((int)s.length()/2);
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            BigInteger num3 = num1.add(num2);
            s = num3.toString();
            System.out.println(s);
            if(s.length()==1) {
                break;
            }
        }
    }
}

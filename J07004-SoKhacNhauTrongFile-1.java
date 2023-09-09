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
        int[] arr = new int[100001];
        while(ip.hasNext()) {
            String s = ip.next();
            int num = Integer.parseInt(s);
            ++arr[num];
        }
        for(int i = 0; i<=100001; ++i) {
        if(arr[i]!=0) {
            System.out.println(i + " " + arr[i]);
        }
        }
    }
}

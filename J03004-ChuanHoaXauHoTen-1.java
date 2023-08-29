/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;


public class JavaClass {  
    
    public static String chuanHoa(String s) {
        if(s.length() == 1) {
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0) {
            String s = ip.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            for(String i : arr) {
                System.out.print(chuanHoa(i) + " ");
            }
            System.out.println("");
        } 
    }
}
// split dung tach chuoi split(regex, int)
//int neu bang 0 thi bo het cho nao co regex, >0 thi bo regex di int -1 lan
// regex bo nhung cho nao co cai nay trong String
//subString in ra cac letter chuoi tu i -> j
//join dung de in them cac xau xen ke giuwa cac chuoi
//  "\\s" am chi single white spaces
//  "\\s+" am chi one or more(group) white spaces

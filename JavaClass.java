/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class JavaClass {  
    
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0) {
            String s1,s2;
            s1 = ip.nextLine();
            s2 = ip.nextLine();
            String[] arr1 = s1.split("\\s+");
            String[] arr2 = s2.split("\\s+");
            Set<String> set1 = new TreeSet<>();
            Set<String> set2 = new TreeSet<>();
            Collections.addAll(set2, arr2);
            Collections.addAll(set1, arr1);
            Set<String> set3 = new TreeSet<>();
            set3.addAll(set1);
            set1.retainAll(set2);
            set3.removeAll(set1);
            for(String i : set3) {
                System.out.print(i + " ");
            }
                set1.clear();
                set2.clear();
                set3.clear();
                System.out.println("");
        }
    }
}
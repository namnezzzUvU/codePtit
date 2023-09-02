/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;






import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class JavaClass {  
    
    public static Scanner ip = new Scanner(System.in);
    public static int[] c = new int[10000];
   
    
    public static void main(String[] args) {
        String s = ip.nextLine();
        Set<Character> set = new HashSet<Character>();
        for(int i = 0;i<s.length();++i) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    } 
}

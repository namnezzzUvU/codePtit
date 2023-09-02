/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;






import java.util.Scanner;



public class JavaClass {  
    
    public static Scanner ip = new Scanner(System.in);
    public static int[] c = new int[10000];
   
    
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0) {
            String[] arr = ip.nextLine().split("\\s+");
            for(int i = 0; i<arr.length;++i) {
                StringBuilder s = new StringBuilder(arr[i]);
                System.out.print(s.reverse()+ " ");
            }
            System.out.println("");
        }
    } 
}

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
   
     public static void xuly(String s) {
        char[] c = new char[98];
        int tmp = 0;
        for(int i = 5;i<s.length();i++) {
            if(i==8) {
                continue;
            }
            c[tmp] = s.charAt(i);
            ++tmp;
        }
        int[] arr = new int[98];
        if(c[0]==c[1]&&c[1]==c[2]) {
            if(c[3]==c[4]) {
                arr[3] = 4;
            }
        }
        for(int i = 1;i<=5;++i) {
            if(c[i]>c[i-1]) {
                arr[1]++;
            }
            if(c[i]==c[i-1]) {
                ++arr[2];
            }
            if(c[i]-'0'==6||c[i]-'0'==8) {
                ++arr[4];
            }
        }
        for(int i = 1;i<=4;++i) {
            if(arr[i]==4) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0) {
            String s = ip.nextLine();
            xuly(s);
        }
    }
} 


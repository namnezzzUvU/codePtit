/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

class Point {
    public double x, y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double doDaiCanh(Point d2) {
        return Math.sqrt((x-d2.x)*(x-d2.x)+(y-d2.y)*(y-d2.y));
    }
}

public class JavaClass {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t;
        double x,y;
        t = ip.nextInt();
        while(t-->0) {
        Point[] arr = new Point[4];
            for(int i = 1; i<=3; ++i) {
                x = ip.nextDouble();
                y = ip.nextDouble();
                arr[i] = new Point(x,y);
            }
            double a = arr[1].doDaiCanh(arr[2]);
            double b = arr[2].doDaiCanh(arr[3]);
            double c = arr[3].doDaiCanh(arr[1]);
            if(a + b > c && b + c > a && a + c > b) {
                System.out.printf("%.2f\n",(double) 1 / 4 * Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c)));
            }                                                                                              // vcl de phep tinh theo a b c ms Ac :)
            else {
                System.out.println("INVALID");
            }
        }
        
    } 
}

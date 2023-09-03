/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class Point {
    public double x;
    public double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double khoangCach(Point p2) {
        return Math.sqrt((x - p2.x)*(x - p2.x)+(y-p2.y)*(y-p2.y));
    }
}


public class JavaClass {  
    
 
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0) {
            Point p1,p2;
            p1 = new Point(ip.nextDouble(),ip.nextDouble());
            p2 = new Point(ip.nextDouble(),ip.nextDouble());
            System.out.printf("%.4f\n",p1.khoangCach(p2));
        }
    }
} 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

class Point
{
    public double x,y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point d2) {
        return Math.sqrt((x - d2.x)*(x - d2.x)+(y - d2.y)*(y - d2.y));
    }
}   
public class JavaClass {
    public static Scanner ip = new Scanner(System.in);
    
    public static void main(String[] args) {
      int t;
      t = ip.nextInt();
      while(t-->0) {
          Point[] arr = new Point[4];
          for(int i=1;i<=3;++i) {
              double x = ip.nextDouble();
              double y = ip.nextDouble();
              arr[i] = new Point(x,y);
          }
          double a = arr[1].distance(arr[2]);
          double b = arr[2].distance(arr[3]);
          double c = arr[3].distance(arr[1]);
          if(a + b > c && a + c > b && b + c > a) { 
              float f = 1/4f;
              double S = f * Math.sqrt((a + b + c)*(a + b -c)*(a - b + c)*(-a + b + c)); // neu khong ep kieu thi 1/4 no se thanh int => S = 0
              double R = (a*b*c)/(4*S);
              System.out.printf("%.3f\n",(double)R*R*Math.PI);
          }
          else {
              System.out.println("INVALID");
          }
      }
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

class Point3D {
    public int x,y,z;
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        int xa = B.x - A.x;
        int ya = B.y - A.y;
        int za = B.z - A.z;
        int xc = C.x - A.x;
        int yc = C.y - A.y;
        int zc = C.z - A.z;
        int xb = D.x - A.x;
        int yb = D.y - A.y;
        int zb = D.z - A.z;
        double x = ya*zb-za*yb;
        double y = za*xb-xa*zb;
        double z = xa*yb-ya*xb;
        if(x*xc + y*yc+ z*zc == 0) {
            return true;
        }
        return false;
    }
}
public class JavaClass {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    } 
}

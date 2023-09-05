/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class rectange {
    public long height, weight;
    public String color;
    
    public rectange(Long height, Long weight, String color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    
    public String setColor() {
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }
    
    public long chuVi() {
        return (height + weight)*2;
    }
    
    public long dienTich() {
        return height*weight;    
    }
}



public class JavaClass {  
    
 
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        long height = ip.nextLong();
        long width = ip.nextLong();
        rectange p1 = new rectange(height,width, ip.next());// vi o day input khong yeu cau xuong dong cho string, nen phai next de doc token ke
        if(height>0 &&width >0) {
        System.out.println(String.format("%d %d %s", (int) p1.chuVi(), (int) p1.dienTich(), p1.setColor()));
        }
        else {
            System.out.println("INVALID");
        }
    }
} 


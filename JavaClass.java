/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class hocSinh {
    private double diem1, diem2, diem3;
    private String name, doB;
    public hocSinh(String name, String doB, double diem1, double diem2, double diem3) {
        this.name = name;
        this.doB = doB;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public void in() {
        System.out.print(this.name + " " + this.doB + " ");  
        System.out.println(String.format("%.1f", this.diem1 + this.diem2 + this.diem3));
    }
}

public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        hocSinh h1 = new hocSinh(ip.nextLine(), ip.nextLine(), ip.nextFloat(), ip.nextFloat(), ip.nextFloat());
        h1.in();
        
    }
} 


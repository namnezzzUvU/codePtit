/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class sinhVien {
    private double GPA;
    private String name, doB, lop;
    public sinhVien() {
        this.name = this.doB = this.lop = "";
        this.GPA = 0;
    }
    public sinhVien(String name, String lop, String dob, double GPA) {
        this.name = name;
        this.doB = dob;
        this.lop = lop;
        this.GPA = GPA;
    }
    public void in() {
        System.out.print("B20DCCN001 " + this.name + " " + this.lop + " ");
        if(this.doB.charAt(1) == '/') {
            this.doB = "0" + this.doB ;
            
        }
        if(this.doB.charAt(4) == '/') {
            System.out.print(this.doB.subSequence(0, 3) + "0" + this.doB.substring(3));
        }
        else {
            System.out.print(this.doB);
        }
        System.out.println(String.format(" %.2f", this.GPA));
    }
}

public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        sinhVien h1 = new sinhVien(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextFloat());
        h1.in();
    }
} 


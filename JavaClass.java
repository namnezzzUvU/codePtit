/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;
class phanSo {
    public long tuSo, mauSo;
    
    public phanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public long findGCD(long a, long b) {
        while(a != 0) {
            long x = a;
            a = b%a;
            b = x;
        }
        return b;
    }
    
    public void sum (phanSo p2) {
        long lcmMSC = findGCD(mauSo,p2.mauSo);
        long msc = mauSo * p2.mauSo / lcmMSC;
        long tu = msc / mauSo * tuSo + msc / p2.mauSo * p2.tuSo;
        long lcm = findGCD(tu, msc);
        System.out.println((long)tu/lcm + "/" + (long)msc/lcm);
    }
   
}

public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        phanSo p1 = new phanSo(ip.nextLong(), ip.nextLong());
        phanSo p2 = new phanSo(ip.nextLong(), ip.nextLong());
        p1.sum(p2);
    }
} 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;
class phanSo {
    private long tuSo, mauso;
    private long mausochung;
    
    public phanSo(long tuSo, long mauso) {
        this.mauso = mauso;
        this.tuSo = tuSo;
    }
    public void findGCD() {
        long tmp = this.mauso;
        long sbc = this.tuSo;
        long sc = this.mauso;
        if(sbc<sc) {
            long cnt = sbc;
            sbc = sc;
            sc = cnt;
        }
        while(true) {
           tmp = sbc % sc;
           if(tmp == 0){
               this.mausochung = sc;
               return;
           }
           sbc = sc;
           sc = tmp;
        }
    }
    public void display() {
        findGCD();
        System.out.println(this.tuSo/this.mausochung + "/" + this.mauso / this.mausochung); 
    }
}

public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        phanSo p1 = new phanSo(ip.nextLong(), ip.nextLong());
        p1.display();
    }
} 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;
class entrance {
    private String ID, name, ketqua ,bn;
    private double score1, score2, score3, bonus, tong;
    
    public entrance(String ID, String name, double score1 , double score2, double score3) {
        this.ID = ID;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
  
    public void in() {
        switch(this.ID.charAt(2)) {
            case '1': 
                this.bonus = 0.5;
                this.bn = "0.5";
                break;
            case '2':
                this.bonus = 1;
                this.bn = "1";
                break;
            case '3':
                this.bonus = 2.5;
                this.bn = "2.5";
                break;
        }
        this.tong = this.score1*2 + this.score2 + this.score3;
            if(this.tong + this.bonus>=24) {
                this.ketqua = "TRUNG TUYEN";
            }
            else {
                this.ketqua = "TRUOT";
            }
            if(this.tong - (int)this.tong == 0) {
                System.out.println(this.ID + " " + this.name + " " + this.bn + " " + (int)this.tong + " " + this.ketqua);
            }
            else {
                System.out.print(this.ID + " " + this.name + " " + this.bn + " ");
                System.out.printf("%.1f",this.tong);
                System.out.println(" " + this.ketqua);
            }
    }
}
public class JavaClass {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID = sc.nextLine();
        String name = sc.nextLine();
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();
        entrance p = new entrance(ID,name,score1,score2,score3);
        p.in();
       }
    } 

//KV2A002 Hoang Thanh Tuan 5 6 5

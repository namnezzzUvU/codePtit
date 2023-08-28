/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;
class clerk {
    private String name,role,id;
    private int basicSalary, cntDay, all, roleMoney, bonus;
    
    public clerk(String name, int basicSalary, int cntDay, String role) {
        this.id = "NV01";
        this.name = name;
        this.basicSalary = basicSalary;
        this.cntDay = cntDay;
        this.role = role;
    }
    public void in() {
        int t = this.basicSalary*this.cntDay;
        if(this.cntDay>=25) {
            this.bonus =(int) (0.2f * t);
        }
        else if (this.cntDay >=22) {
            this.bonus =(int) (0.1f * t);
        }
        else {
            this.bonus = 0;
        }
        switch(this.role) {
            case "GD" :
                this.roleMoney = 250000;
                break;
            case "PGD" :
                this.roleMoney = 200000;
                break;
            case "TP" :
                this.roleMoney = 180000;
                break;
            case "NV" :
                this.roleMoney = 150000;
                break;
        }
        this.all = this.basicSalary*this.cntDay + this.bonus + this.roleMoney;
        System.out.println(this.id + " " + this.name + " " + t + " " + this.bonus + " " + this.roleMoney + " " + this.all);
    }
}

public class JavaClass {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int basicSalary = sc.nextInt();
        int cntDay = sc.nextInt();
        sc.nextLine();
        String role = sc.nextLine();
           clerk p1 = new clerk(name, basicSalary, cntDay, role);
           p1.in();
           
       }
    } 


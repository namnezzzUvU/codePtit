/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class clerk {
    private String name, gender, doB, address, contractSigned;
    private long taxCode;
    
    public clerk(String name, String gender, String doB, String address,long taxCode, String conTractSigned ) {
        this.address = address;
        this.contractSigned = conTractSigned;
        this.doB = doB;
        this.gender = gender;
        this.name = name;
        this.taxCode = taxCode;
    }
    public void in() {
        System.out.println("00001 " + this.name + " " + this.gender + " " + this.doB + " " + this.address + " " +this.taxCode + " " + this.contractSigned);
    }
}

public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        String gender = ip.nextLine();
        String doB = ip.nextLine();
        String address = ip.nextLine();
        long taxCode = ip.nextLong();
        ip.nextLine();
        String contractSigned = ip.nextLine();
        clerk nv = new clerk(name, gender, doB, address, taxCode, contractSigned);
        nv.in();
    }
} 


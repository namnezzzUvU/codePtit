/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class teacher {
    private String code, name;
    private long basicIncome, secondIncome, Incomee, heSo;
    
    public teacher(String code, String name, long basicIncome) {
        this.basicIncome = basicIncome;
        this.code = code;
        this.name = name;
    }
    
    public void secIncome() {
        switch(code.charAt(1)) {
            case 'T':
                secondIncome = 2000000L;
                return;
            case 'P':
                secondIncome = 900000L;
                return;
            case 'V':
                secondIncome = 500000L;
                return;
        }
    }
     public void Income() {
         secIncome();
         long tmp = code.charAt(2) - '0';
         heSo = tmp*10 + code.charAt(3)-'0';
         Incomee = basicIncome*heSo + secondIncome;
     }
     
     public void in() {
         Income();
         System.out.println(code + " " + name + " " + heSo + " " + secondIncome + " " + Incomee);
     }
}
public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        teacher i = new teacher(ip.nextLine(), ip.nextLine(), ip.nextLong());
        i.in();
    }
} 


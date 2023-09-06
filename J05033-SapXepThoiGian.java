/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class gio {
    public long gio, phut, giay, sum;
  
    public gio(long gio, long phut, long giay) {
        this.giay = giay;
        this.gio = gio;
        this.phut = phut;
        sum = gio*3600 + phut*60 + giay;
    }
    
}
   
public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        gio[] arr = new gio[5001];
        for(int i = 0;i <t; ++i) {
            arr[i] = new gio(ip.nextLong(), ip.nextLong(), ip.nextLong());
        }
        for(int i = 0; i<t-1; ++i ) {
                for(int j = i+1;j<t;++j) {
                    if(arr[i].sum>arr[j].sum) {
                        gio tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
        }
        for(int i = 0; i<t;++i) {
            System.out.println(arr[i].gio + " " + arr[i].phut + " " + arr[i].giay);
        }
    }
} 


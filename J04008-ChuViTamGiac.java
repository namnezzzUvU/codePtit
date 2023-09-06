/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;








import java.util.Scanner;

class Round {
    private double xdiem1, ydiem1, xdiem2, ydiem2, xdiem3, ydiem3;
    public Round (double xdiem1, double ydiem1, double xdiem2, double ydiem2, double xdiem3, double ydiem3) {
        this.xdiem1 = xdiem1;
        this.ydiem1 = ydiem1;
        this.xdiem3 = xdiem3;
        this.ydiem3 = ydiem3;
        this.xdiem2 = xdiem2;
        this.ydiem2 = ydiem2;
    }
    
    public double distance(double a, double b, double x, double y) {
        return Math.sqrt((a-x)*(a-x) + (y-b)*(y-b));
    }
    
    public void inRound() {
        double canh1 = distance(xdiem1, ydiem1, xdiem2, ydiem2);
        double canh2 = distance(xdiem1, ydiem1, xdiem3, ydiem3);
        double canh3 = distance(xdiem2, ydiem2, xdiem3, ydiem3);
        if(canh1 + canh2 <= canh3 || canh3 + canh2 <= canh1 || canh1 + canh3 <= canh2){
            System.out.println("INVALID");
        }
        else {
            System.out.println(String.format("%.3f", canh1 + canh2 + canh3));
        }
    }
}

public class JavaClass {  
       
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        Round[] rectangle = new Round[t];
        for(int i = 0;i<t;++i) {
            rectangle[i] = new Round(ip.nextDouble(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble());
            rectangle[i].inRound();
        }
    }
} 


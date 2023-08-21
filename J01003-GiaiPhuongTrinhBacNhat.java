package codeptit;

import java.util.Scanner;

public class CodePtit {

    
    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       float a, b;
       a = ip.nextFloat();
       b = ip.nextFloat();
       if(a==0f&&b==0f) {
           System.out.println("VSN");
       }
       else if(a==0f&&b!=0f) {
           System.out.println("VN");
       }
       else {
           System.out.println(String.format("%.2f", -b / a));
       }
    }
}

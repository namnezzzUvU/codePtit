package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    public static String s;
    public static String caculate() {
        s = s.replace('8', '0');
        s = s.replace('9', '0');
        s = s.replace('1', '1');
        for(int i = s.length()-1; i>=0; --i) {
            if(s.charAt(i) != '1' && s.charAt(i) != '0') {
                return "INVALID";
            }
        }
        return s;
    }
    
    public static void main(String[] args) {
       int t;
       Long number;
       t = ip.nextInt();
       ip.nextLine(); //bỏ qua kí tự /n ở dòng trên, giống cin.ignore c++
       while(t-->0) {
           s = ip.nextLine();
           s = caculate();
           if(s == "INVALID") {
               System.out.println(s);
           }
           else {
               number = Long.parseLong(s);
               if(number == 0) {
                   System.out.println("INVALID");
                   continue;
               }
               System.out.println(number);
           }
       }
    }
}

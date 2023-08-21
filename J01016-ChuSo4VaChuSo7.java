package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static int countNum(String s) {
        int sum=0;
        for(int i=0;i<s.length();++i)
        {
            if(s.charAt(i)=='4'||s.charAt(i)=='7') {
                ++sum;
            }
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
           String n;
           n = ip.nextLine();
           int sum = countNum(n);
           if(sum==4||sum==7) {
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
    }
}

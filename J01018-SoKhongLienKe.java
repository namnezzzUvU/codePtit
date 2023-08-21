package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static String check(String s) {
        int sum = (int) s.charAt(s.length()-1) - '0';
        for(int i=0;i<=s.length()-2;++i) {
            int tmp = (int) s.charAt(i+1) - '0';
            int tmp2 = (int) s.charAt(i) - '0';
            sum+=tmp2;
            if(tmp + 2 == tmp2) {
                continue;
            }
            else if(tmp2 + 2 == tmp) {
                continue; //no need to continue here, cause i lazy
            }
            else {
                return "NO";
            }
        }
        if(sum%10==0) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    
    
    public static void main(String[] args) {
          int t;
          t = ip.nextInt();
          String s;
          ip.nextLine();
          while(t-->0) {
              s = ip.nextLine();
              System.out.println(check(s));
          }
    }
}

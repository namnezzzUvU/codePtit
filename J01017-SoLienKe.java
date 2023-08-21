package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static String check(String s) {
        for(int i=0;i<=s.length()-2;++i) {
            int tmp = (int) s.charAt(i+1) - '0';
            int tmp2 = (int) s.charAt(i) - '0';
            if(tmp2 == tmp + 1) {
                continue;
            }
            else if(tmp2 + 1 == tmp) {
                continue; //no need to continue here, cause i lazy
            }
            else {
                return "NO";
            }
        }
        return "YES";
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

package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static String check(String s) {
        for(int i=0;i<s.length();++i) {
            if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2') {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
          int t;
          t = ip.nextInt();
          String k;
          ip.nextLine();
          while(t-->0) {
              k = ip.nextLine();
              System.out.println(check(k));
          }
    }
}

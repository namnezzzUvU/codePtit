
package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static Long UCLN(Long soBe, Long soLon) {
        Long sodu = 999L,k = 5L;
        while(sodu!=0) {
            sodu = soLon%soBe;
            soLon = soBe;
            k = soBe;
            soBe = sodu;
        }
        return k;
    }
    
    public static void main(String[] args) {
       Long t,soBe,soLon;
       Long bcnn,ucl;
       t = ip.nextLong();
       while(t-->0) {
           soBe = ip.nextLong();
           soLon = ip.nextLong();
           if(soBe>soLon) {
            Long temp = soBe;
            soBe = soLon;
            soLon = temp;
           }
           ucl = UCLN(soBe, soLon);
           bcnn = soBe*soLon;
           bcnn /= ucl;
           System.out.println(bcnn + " " + ucl);
       }
    }
}

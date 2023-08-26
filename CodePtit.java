package codeptit;



import java.math.BigInteger; // Class 2 so lon
import java.util.Scanner;
import java.util.Vector;

 

public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t;
        t = ip.nextInt();
        while(t-->0) {
        BigInteger a = ip.nextBigInteger();
        BigInteger b = ip.nextBigInteger();
        BigInteger Multi = a.multiply(b); //a*b
        BigInteger gcd = a.gcd(b); // UCLN
        BigInteger lcm = Multi.divide(gcd);
            System.out.println(lcm);
        }
    }
}

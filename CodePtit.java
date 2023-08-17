/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author mrcit
 */
public class CodePtit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       int t = ip.nextInt();
       long n;
       while(t>0) {
           t--;
       n = ip.nextInt();
           System.out.println((n+1)*n/2);
    }
}
}
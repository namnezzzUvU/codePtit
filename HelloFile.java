/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;









import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

import java.io.File;
import java.util.Scanner;
public class JavaClass {
    public static void main(String[] args) throws Exception
    {
        File file = new File("Hello.txt");
        Scanner ip = new Scanner(file);
        while(ip.hasNextLine()) {
            System.out.println(ip.next());
        }
    }
}

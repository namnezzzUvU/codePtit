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
        // pass the path to the file as a parameter
        File file = new File(
            "DATA.in");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNext())
            System.out.println(sc.nextLine());
    }
}

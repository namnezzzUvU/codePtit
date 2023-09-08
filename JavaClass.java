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

class store {
    private String nameProduct, unit, code;
    private int sell, buy, profit;
    public store(String nameProduct, String unit, int sell, int buy, String s) {
        this.buy = buy;
        this.nameProduct = nameProduct;
        this.sell = sell;
        this.unit = unit;
        profit =  this.buy - this.sell;
        code = s;
    }
    @Override
    public String toString() {
        return code + " " + nameProduct + " " + unit + " " + sell + " " + buy + " " + profit;
    }
    //method to get the variable
    public int getProfit() {
        return profit;
    }
}

class compareProfit implements Comparator<store> {
    @Override
    public int compare(store a, store b) {
        return b.getProfit() - a.getProfit();
    }
}

public class JavaClass {  
    
    public static String addZero(int k) {
        String s = "MH",tmp;
        tmp = Integer.toString(k);
        int cnt = 3 - tmp.length();
        while(cnt>0) {
            s+="0";
            --cnt;
        }
        s+=tmp;
        return s;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        store[] arr = new store[t];
        Vector<store> a = new Vector<>();
        for(int i = 0; i<t;++i) {
            ip.nextLine();
            String s = addZero(i+1);
            arr[i] = new store(ip.nextLine(), ip.nextLine(), ip.nextInt(), ip.nextInt(), s);
            a.add(arr[i]);
        }
        compareProfit cp = new compareProfit();
        Collections.sort(a,cp);
        for(store tmp : a) {
            System.out.println(tmp);
        }
        /*for(int i = 0; i<t-1;++i) {
            for(int j = i+1; j<t;++j) {
            if(arr[i].profit<=arr[j].profit) {
                store tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            }
        }
        for(int i = 0;i<t-1;++i) {
            for(int j = i+1;j<t-1;++j) {
                if(arr[j].profit!=arr[j+1].profit) {
                    break;
                }
                if(arr[i].code.compareTo(arr[j].code) == 1) {
                store tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                }
            }
        }
        for(int i = 0;i<t;++i) {
            System.out.println(arr[i].code + " " + arr[i].nameProduct + " " + arr[i].unit + " " + arr[i].sell + " " + arr[i].buy + " " + arr[i].profit);
        }*/
    }
} 
//Ao phong tre em Cai 25000 41000 Ao khoac nam Cai 240000 515000 Quan Chiec 25000 41000 Ao khoac long cuu Cai 240000 1000000

package codeptit;



import java.util.Scanner;


public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   
   public static int[] arr = new int[1000];
   public static int k;
   public static boolean[] check = new boolean[1000];
   
   public static void sout() {
       for(int i = 1; i < k ;++i) {
           if(Math.abs(arr[i]-arr[i+1])==1) {
               return;
           }
       }
       for(int i = 1;i<=k;++i) {
           System.out.print(arr[i]);
       }
       System.out.println("");
   }
   
   public static void genNext(int i) {
       for(int j = 1;j<=k;++j) {
           if(check[j]==true) {
               arr[i] = j;
               check[j] = false;
               if(i==k) {
                   sout(); 
               }
               else{
                   genNext(i+1);
               }
               check[j]=true;
           }
       }
   }
   
   
       
    public static void main(String[] args) {
        int n;
        n = ip.nextInt();
        while(n-->0) {
            k = ip.nextInt();
            for(int i=1;i<=k;++i) {
                check[i] = true;
            }
            genNext(1);
        }
    }
}

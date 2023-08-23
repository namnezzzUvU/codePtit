package codeptit;



import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
  
    public static void main(String[] args) {
     int n,tmp, flag, test = 1;
     n = ip.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;++i) {
         arr[i] = ip.nextInt();
     }
     for(int i=0;i<n-1;++i) {
         flag = 0;
         for(int j=1;j<n;++j){
             if(arr[j]<arr[j-1]) {
                 flag = 1;
                 tmp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = tmp;
             }
         }
         if(flag!=0) {
         System.out.print("Buoc " + test + ": ");
         ++test;
         for(int t = 0; t<n;++t) {
             System.out.print(arr[t] + " ");
         }
         System.out.println("");
         }
     }
    }    
 }

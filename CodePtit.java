package codeptit;



import java.util.Scanner;


public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   
   public static boolean checkLast(int n, int[] arr) {
       int t;
       for(int i = 0; i<n-1; ++i) {
           t = arr[i] + arr[i+1];
           if(t%2==0) {
               return false;
           }
       }
       return true;
   }
   
   public static int[] erase0Element(int n, int[] arr) {
       int cnt = 0;
       int[] arr2 = new int[n];
       for(int i=0;i<n;++i) {
           if(arr[i]!=0) {
               arr2[cnt] = arr[i];
               ++cnt;
           }
       }
       return arr2;
   }
   
   public static int findLength(int n, int[] arr) {
       int cnt = 0;
       for(int i = 0; i<n;++i) {
           if(arr[i] != 0 ) {
               ++cnt;
           }
       }
       return cnt;
   }
   
   public static void findOddNumber(int n, int[] arr) {
       int t;
       for(int i=0; i<n-1; ) {
           t = arr[i] + arr[i+1];
           if(t%2==0) {
               arr[i]=0;
               arr[i+1]=0;
               i+=2;
           }
           else{
               ++i;
           }
       }
   }
       
    public static void main(String[] args) {
     int n;
     n = ip.nextInt();
     int[] arr = new int[n];
     for(int i = 0; i<n;++i) {
         arr[i] = ip.nextInt();
     }
     int length = findLength(n, arr);
     while(true) {
         findOddNumber(length, arr);
         arr = erase0Element(length, arr);
         length = findLength(length, arr);
         if(checkLast(length, arr)) {
             System.out.println(length);
             break;
         }
     }
    }  
 }

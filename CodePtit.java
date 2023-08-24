package codeptit;



import java.util.Scanner;


public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   
   public static int tmp = 0;
   public static void sout(int[] arr, int n, int k) {
       for(int i = 1;i<=k;++i) {
           System.out.print(arr[i]);
       }
        System.out.print(" ");
   }
   public static void genNext(int[] arr, int i,int n, int k) {
      for(int j = arr[i-1] + 1; j<=n-k+i; ++j) {
          arr[i] = j;
          if(i==k) {
              ++tmp;
              sout(arr,n,k);
          }
          else {
              genNext(arr,i+1, n, k);
          }
      }
   }
   
   
       
    public static void main(String[] args) {
        int n,k;
        n = ip.nextInt();
        k = ip.nextInt();
        int[] arr = new int[1000];
        genNext(arr, 1, n, k);
        System.out.println("");
        System.out.println("Tong cong co " + tmp + " to hop");
    }
}

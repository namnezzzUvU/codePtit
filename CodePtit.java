package codeptit;



import java.util.Scanner;


public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   
    public static int[] arr = new int[1000];
    public static int[] arr2 = new int[1000];
       
    public static void main(String[] args) {
        int n;
        n = ip.nextInt();
        int tmp = -99;
        for(int i = 1; i<=n; ++i) {
            arr[i] = ip.nextInt();
            arr2[arr[i]] = 1;
            if(arr[i]>tmp) {
                tmp = arr[i];
            }
        }
        int flag = 1;
        for(int i = 1; i<=tmp; ++i) {
           if(arr2[i] == 0) {
               flag = 0;
               System.out.print(i);
               System.out.println("");
           }
        }
        if(flag == 1) {
            System.out.println("Excellent!");
        }
    }
}

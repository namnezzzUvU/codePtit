package codeptit;



import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
  
    public static void main(String[] args) {
        int n,max = -99, test = 1,tmp,flag;
        n = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i) {
            arr[i] = ip.nextInt();
        }
        System.out.println("Buoc 0: " + arr[0]);
        for(int i=0;i<n-1;++i) {
            for(int j=i+1;j>0;--j) {
                if(arr[j-1]>arr[j]) {
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for(int t=0;t<=i+1;++t) {
                System.out.print(arr[t] + " ");
            }
            System.out.println("");
        }
    }
        
 }

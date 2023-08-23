package codeptit;



import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
  
    public static void main(String[] args) {
        int n,max = -99, test = 1,tmp;
        n = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i) {
            arr[i] = ip.nextInt();
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        for(int i=0;i<n-1;++i) {
                for(int j=i+1;j<n;++j) {
                    if(arr[i]>arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            System.out.print("Buoc " + test + ": ");
                ++test;
            for(int k=0;k<n;++k) {
                System.out.print(arr[k] + " ");
            }
            System.out.println("");
            }
        }
 }

package codeptit;



import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t,n;
        t = ip.nextInt();
        int tmp = t;
        while(t-->0) {
            n = ip.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[100005];   
            for(int i=0;i<n;++i) {
                arr[i] = ip.nextInt();
                ++arr2[arr[i]]; 
            }
            System.out.println("Test " + (tmp - t)+":");
            for(int i=0;i<n;++i) {
                if(arr2[arr[i]]>0) {
                    System.out.println(arr[i] + " xuat hien " + arr2[arr[i]] + " lan");
                    arr2[arr[i]]=0;
                }
            }
        }
    }
}

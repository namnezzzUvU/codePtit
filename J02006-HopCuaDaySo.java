package codeptit;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int m,n;
        m = ip.nextInt();
        n = ip.nextInt();
        int[] arr = new int[m];
        int[] arr2 = new int[n];
        int[] compare = new int[1001];
        for(int i=0;i<m;++i) {
            arr[i] = ip.nextInt();
            compare[arr[i]] = 1;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;++i) {
            arr2[i] = ip.nextInt();
            compare[arr2[i]] = 1;
        }
        for(int i = 0; i<1001; ++i){
            if(compare[i]==1) {
                System.out.print(i + " ");
            }
        }
    }
}

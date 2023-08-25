package codeptit;



import java.util.Scanner;
import java.util.Vector;

 

public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   
   public static int test =1;
    public static void main(String[] args) {
        int t,m,n;
        t = ip.nextInt();
        while(t-->0) {
        n = ip.nextInt();
        m = ip.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[n][n];
        for(int i=0; i<n; ++i ) {
            for(int j = 0; j<m; ++j) {
                arr[i][j] = ip.nextInt();
                arr2[j][i] = arr[i][j];
            }
        }
       
        for(int i = 0; i<n ; ++i) {
            for(int j = 0; j<n; ++j) {
                arr3[i][j] = 0;
                for(int k = 0; k<m; ++k) {
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
            System.out.println("Test " + test + ":");
            ++test;
       for(int i = 0; i<n ; ++i) {
            for(int j = 0; j<n; ++j) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
       }    
    }
    }
}

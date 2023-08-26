package codeptit;



import java.util.Scanner;
import java.util.Vector;

 

public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   public static int[][] arr = new int[1001][1001];
    public static void main(String[] args) {
        int n;
        n = ip.nextInt();
        for(int i=0;i<n;++i) {
            for(int j=0;j<n;++j) {
                arr[i][j] = ip.nextInt();
            }
        }
        for(int i = 0;i<n;++i) {
            for(int j = 0;j<n;++j) {
                if(arr[i][j]==1) {
                    arr[i][j]=0;
                    arr[j][i]=0;
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
    }
}
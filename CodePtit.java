package codeptit;



import java.util.Scanner;
import java.util.Vector;

 

public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   public static int[][] arr = new int[1002][1002];
    public static void main(String[] args) {
        int n,test = 0;
        n = ip.nextInt();
        for(int i=1;i<=n;++i) {
            for(int j=1;j<=3;++j) {
                arr[i][j] = ip.nextInt();
            }
        }
        for(int i = 1;i<=n;++i) {
            int tmp = 0;
           for(int j = 1; j<=3; ++j) {
               if(arr[i][j]==1) {
                   ++tmp;
                   if(tmp>1) {
                       ++test;
                       break;
                   }
               }
           }
        }
        System.out.println(test);
    }
}
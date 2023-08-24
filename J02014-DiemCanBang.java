package codeptit;



import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    public static int[] arr = new int[100001];
    public static int[] trai = new int[100001];
    public static int n;
    public static void benTrai() {
        int tmp = 1, flag = 0;
        for(int i = n; i >0; --i) {
            trai[tmp] = flag + arr[i];
            flag = trai[tmp];
            ++tmp;
        }
    }
    public static void main(String[] args) {
     int t;
     t = ip.nextInt();
     int[] phai = new int[100001];
     while(t-->0) {
         n = ip.nextInt();
         for(int i = 1;i <= n; ++i) {
             arr[i] = ip.nextInt();
         }
         benTrai();
         int tmp = 0,flag = 0;
         for(int i = 1; i < n ; ++i) {
             phai[i] = tmp + arr[i];
             tmp = phai[i];
             if(phai[i]==trai[n-(i+1)]) {
                 System.out.println(i+1);
                 flag = 1;
                 break;
             }
         }
         if(flag == 0) {
             System.out.println("-1");
         }
        //-7 1 5 2 -4 3 0
       // 0 3 -1 1 6 7 0 
       //-7 -6 -1 3 -1 2 0
       //(1,5) (2,4) (3,3) (4,2)
     }
    }    
 }

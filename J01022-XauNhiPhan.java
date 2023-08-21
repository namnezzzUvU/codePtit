package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    public static long[] Fi = new long[100];
    public static void fibo() {
       Fi[1] = 1L;
       Fi[2] = 1L;
       for(int i=3;i<=94;++i) {
           Fi[i]=Fi[i-2]+Fi[i-1];
       }
    }
    public static char findInBinary(int n, long k) {
        if(n==1) {
            return '0';
        }
        else if(n==2) {
            return '1';
        }
        if(k <= Fi[n-2]) {
            return findInBinary(n-2, k); //nếu số thứ tự k nằm trong số
                                        //fibo [n-2], ta giữ nguyên k
                                        //vd: 1234 5678;
                                        //số fibo k =3, ta chỉ cần qtam đến
                                        //Fi[n-2]
                                        
        }
        return findInBinary(n-1, k-Fi[n-2]); //còn nếu k só thứ tự nằm ngoài khoảng n-2
                                             // ta quan tâm đến n-1, và -phải reset số 
                                             //thứ tự của k bằng cách trừ đi f[n-2]
    }
    /* 
    Ex: xau ky tu la 
       0 1 01 101 01101 10101101 0110110101101
T/ứng: 1 1 2   3    5      8 (các số fibo_)
    */
    public static void main(String[] args) {
          fibo();
          int t,n;
          t = ip.nextInt();
          long k;
          while(t-->0) {
              n = ip.nextInt();
              k = ip.nextLong();
              System.out.println(findInBinary(n, k));
          }
    }
}

package codeptit;



import java.util.Scanner;
import java.util.Vector;

 

public class CodePtit {
   
   public static Scanner ip = new Scanner(System.in);
   
   public static Vector<Vector<Integer>> v = new Vector<Vector<Integer>>(1);
   
   
    public static void main(String[] args) {
        int t,n;
        t = ip.nextInt();
        while(t-->0) {
        n = ip.nextInt();
        for(int i=0; i<n; ++i ) {
            Vector<Integer> v1 = new Vector<Integer>(0);
            for(int j=0; j<n; ++j) {
                int tmp = ip.nextInt();
                v1.add(tmp);
            }
            v.add(v1);
        }
        Vector<Integer> v1 = new Vector<Integer>(0);
        for(int i = 0; i<n; ++ i) {
            v1.addAll(v.get(i));
                if(i%2==0) {
                    for(int j = 0; j<n; ++j) {
                        System.out.print(v1.get(j) + " ");
                    }
                }
                else {
                    for(int j = n-1; j>=0; --j) {
                        System.out.print(v1.get(j) + " ");
                    }
                }
            v1.clear();
        }
            System.out.println("");
            v.clear();
        }
    }
}

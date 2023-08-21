package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static final int N = (int) 2e6;
    
    public static int[] eto = new int[N+5];
    
    public static void sangPime() {
        eto[0] = 1;
        eto[1] = 1;
        for(int i=2; i*i<N; ++i) {
            if(eto[i] == 0) {   
                for(int j=i*i;j<=N;j+=i) {
                    if(eto[j] == 0) {
                        eto[j]=i;
                    }
                }
            }
        }
        for(int i = 2; i <=N ; i++){
		if(eto[i]==0){
			eto[i] = i;
		}
	}
    }
    
    public static void main(String[] args) {
       int t,n;
       t = ip.nextInt();
       Long sum=0L;
       sangPime();
       while(t-->0) {
           n = ip.nextInt(); 
           if(eto[n]==0) {
                   sum+=n;
                   continue;
               }
           int tmp = 0;
           while(n!=1) {
               tmp+=eto[n];
               n/=eto[n];
           }
           sum+=tmp;
       }
       System.out.println(sum);
    }
}

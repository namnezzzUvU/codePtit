package codeptit;

import java.util.Scanner;


public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    
    public static void main(String[] args) {
          int x,y,minx=9999,miny=9999,maxx=-9999,maxy=-9999,m,n;
          for(int i=1;i<=4;++i) {
              x = ip.nextInt();
              y = ip.nextInt();
              if(minx>x) {
                  minx=x;
              }
              if(miny>y) {
                  miny=y;
              }
              if(maxx<x) {
                  maxx=x;
              }
              if(maxy<y){
                  maxy=y;
              }
          }
          m = Math.abs(maxx-minx);
          n = Math.abs(maxy-miny);
          if(m>n) {
              System.out.println(m*m);
          }
          else{
              System.out.println(n*n);
          }
    }
}

package codeptit;



import java.util.Arrays;
import java.util.Scanner;



public class CodePtit {
    
    public static Scanner ip = new Scanner(System.in);
    
    /*public static Set<Integer> cinArr(int n) {
        int tmp;
        Set<Integer> arr = new HashSet<>();
        for(int i=1;i<=n;++i) {
            tmp = ip.nextInt();
            arr.add(tmp);
        }
        return arr;
    }
    public static void display(Set<Integer> s) {
        String formmatedString = s.toString();
        formmatedString = formmatedString.replace("[", ""); //bo cac ký tự [ ] , vì khi in ra nó sẽ in ra thành
        // [num1, num2, num2, num3]
        formmatedString = formmatedString.replace("]", "");
        formmatedString = formmatedString.replace(",", "");
        System.out.println(formmatedString);
    }*/
    public static void main(String[] args) {
        int m,n;
        m = ip.nextInt();
        n = ip.nextInt();
        int[] arr = new int[m];
        int[] arr2 = new int[n];
        int[] compare = new int[1001];
        for(int i=0; i<m; ++i) {
            arr[i] = ip.nextInt();
            compare[arr[i]] = 1;
        }
        for(int i=0; i<n; ++i) {
            arr2[i] = ip.nextInt();
        }
        Arrays.sort(arr2);
        for(int i = 0;i<n;++i) {
            if(compare[arr2[i]] == 1) {
                System.out.print(arr2[i] + " ");
                compare[arr2[i]] = 0;
            }
        }
    }
}

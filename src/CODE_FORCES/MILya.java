package CODE_FORCES;


import java.util.*;
import java.util.Scanner;

public class MILya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            int c=0;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
            Set<Integer> Sums = new HashSet<>();

            for (int i = 0; i < n; i++) {
                Sums.add(a[i] + b[i]);
            }
            if(Sums.size()>=3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}

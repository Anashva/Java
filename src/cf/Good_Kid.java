package cf;

import java.util.Scanner;
public class Good_Kid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int m=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                m=Math.min(m,arr[i]);
            }
            int ans=1;
            int c=0;
            for (int i=0;i<n;i++) {
                if (m == arr[i] && c == 0) {
                    m++;
                    ans = ans * m;
                    c = 1;
                } else {
                    ans = ans * arr[i];
                }
            }
            System.out.println(ans);
        }
    }
}

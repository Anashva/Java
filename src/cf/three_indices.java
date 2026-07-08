package cf;

import java.util.HashMap;
import java.util.Scanner;

public class three_indices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean found = false;
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.println("YES");
                    System.out.println((i) + " " + (i + 1) + " " + (i + 2));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("NO");
            }
        }
    }
}

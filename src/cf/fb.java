package cf;
import java.util.*;
public class fb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int ii=0;ii<test;ii++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }
            int[] prefix = new int[n2 + 1];
            int[] suffix = new int[n2 + 1];
            Arrays.fill(suffix, -1);
            Arrays.fill(prefix, n1);
            prefix[0] = -1;
            int j=0;
            for(int i=0;i<n1 && j<n2;i++){
                if (arr1[i] >= arr2[j]) {
                    prefix[j+1] = i;
                    j++;
                }
            }
            j = n2 - 1;
            suffix[n2] = n1;
            for (int i = n1 - 1; i >= 0 && j >= 0; i--) {
                if (arr2[i] >= arr1[j]) {
                    suffix[j] = i;
                    j--;
                }
            }


            if (prefix[n2] < n1) {
                System.out.println("0");
                continue;
            }

            int ans = Integer.MAX_VALUE;
            for (int i = 1; i <= n2; i++) {
                if (prefix[i - 1] < suffix[i]) {
                    ans = Math.min(ans, arr2[i - 1]);
                }
            }
            if(ans==Integer.MAX_VALUE){
                System.out.println(-1);
            }
            else {
                System.out.println(ans);
            }
        }
    }
}

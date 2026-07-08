package cf;
import java.util.*;
public class cb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[m];
            int[] brr = new int[m];

            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                brr[i] = sc.nextInt();
            }

            System.out.println(solve(m, k, arr, brr));
        }
    }
    private static int solve(int n, int k, int[] a, int[] b) {
        Set<Integer> ll= new HashSet<>();
        List<Integer> missingIndices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (b[i] == -1) {
                missingIndices.add(i);
            } else {
                ll.add(a[i] + b[i]);
            }
        }

        // Case 1: Conflicting x values
        if (ll.size() > 1) {
            return 0;
        }

        // Case 2: Fixed x exists
        if (ll.size() == 1) {
            int x = ll.iterator().next();
            for (int i : missingIndices) {
                int bi = x - a[i];
                if (bi < 0 || bi > k) {
                    return 0;
                }
            }
            return 1;
        }

        // Case 3: No known b[i], so try all valid x values
        int Left = Integer.MIN_VALUE;
        int Right = Integer.MAX_VALUE;
        for (int i : missingIndices) {
            Left = Math.max(Left, a[i]);
            Right = Math.min(Right, a[i] + k);
        }

        return Math.max(0, Right - Left + 1);
    }


}

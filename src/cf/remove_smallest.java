package cf;
import java.util.*;
public class remove_smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // array size
            int[] a = new int[n];
            boolean hasOneDiff = false;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] > 1) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}

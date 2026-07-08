package codeforce_practice;

import java.util.*;

public class geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
            }

            result.append(canTransform(a, b) ? "Yes\n" : "No\n");
        }

        System.out.print(result);
        scanner.close();
    }

    public static boolean canTransform(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int j = a.length - 1; // Pointer for array a

        // Traverse b from largest to smallest
        for (int i = b.length - 1; i >= 0; i--) {
            int target = b[i];

            // Try to find a match for b[i] in a
            while (j >= 0 && a[j] > target) {
                j--; // Skip unused elements in a
            }

            while (j >= 0 && a[j] < target) {
                target /= 2; // Reduce b[i] as per the operations
            }

            // If no match is found, return false
            if (j < 0 || a[j] != target) {
                return false;
            }

            j--; // Use the matched element
        }

        return true; // All elements in b are matched
    }
}

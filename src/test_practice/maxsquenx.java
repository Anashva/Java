package test_practice;

import java.util.*;

public class maxsquenx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int t = scanner.nextInt();

        // Array to store results for each test case
        int[] results = new int[t];

        for (int testCase = 0; testCase < t; testCase++) {
            // Read length of the sequence
            int n = scanner.nextInt();

            // Read the sequence
            int[] sequence = new int[n];
            for (int i = 0; i < n; i++) {
                sequence[i] = scanner.nextInt();
            }

            // Calculate maximum possible sum
            results[testCase] = getMaxSum(sequence);
        }

        // Output results
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    private static int getMaxSum(int[] sequence) {
        // If the length of the sequence is 1, return the single element
        if (sequence.length == 1) {
            return sequence[0];
        }

        // Reverse the sequence (if needed) and find the maximum of both ends
        int maxElement = Integer.MIN_VALUE;
        for (int num : sequence) {
            maxElement = Math.max(maxElement, num);
        }

        // Return the maximum element, since it can be preserved regardless of operations
        return maxElement;
    }
}

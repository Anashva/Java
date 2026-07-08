package test_practice;

import java.util.Scanner;

public class BuildingBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of boxes
        long n = scanner.nextLong();

        // Perform binary search to find the minimum k such that S_k >= n
        long low = 1, high = (long) Math.sqrt(2 * n) + 1, result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = mid * (mid + 1) / 2; // Sum of first mid natural numbers

            if (sum >= n) {
                result = mid; // Potential answer
                high = mid - 1; // Look for smaller k
            } else {
                low = mid + 1; // Look for larger k
            }
        }

        System.out.println(result);
        scanner.close();
    }
}

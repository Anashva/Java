package codeforce_practice;

import java.util.Scanner;
import java.util.*;

public class IsoscelesTrapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] sticks = new int[n];

            for (int i = 0; i < n; i++) {
                sticks[i] = scanner.nextInt();
            }

            String output = findIsoscelesTrapezoid(sticks);
            result.append(output).append("\n");
        }

        System.out.print(result);
        scanner.close();
    }

    private static String findIsoscelesTrapezoid(int[] sticks) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each stick length
        for (int stick : sticks) {
            countMap.put(stick, countMap.getOrDefault(stick, 0) + 1);
        }

        // List of lengths that can form pairs
        List<Integer> pairs = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int length = entry.getKey();
            int count = entry.getValue();

            // Each pair requires at least 2 sticks
            if (count >= 4) {
                // If we have 4 or more, we can add two pairs
                pairs.add(length);
                pairs.add(length);
            } else if (count >= 2) {
                // Add one pair
                pairs.add(length);
            }
        }

        // Sort the pairs in descending order
        Collections.sort(pairs, Collections.reverseOrder());

        if (pairs.size() < 2) {
            return "-1"; // Not enough pairs to form an isosceles trapezoid
        }

        // Select the two largest pairs to maximize the base and leg lengths
        int base1 = pairs.get(0);
        int base2 = pairs.get(1);

        return base1 + " " + base1 + " " + base2 + " " + base2;
    }
}

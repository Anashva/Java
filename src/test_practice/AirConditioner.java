package test_practice;

import java.util.Scanner;

public class AirConditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of customers and the initial temperature
        int n = scanner.nextInt();
        long m = scanner.nextLong(); // Initial temperature of the restaurant

        // Variables to keep track of the current time and the temperature range
        long currentTime = 0;
        long minTemp = m, maxTemp = m;

        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            // Read the customer's data
            long t = scanner.nextLong();
            long l = scanner.nextLong();
            long h = scanner.nextLong();

            // Calculate the time difference from the last customer
            long timeDiff = t - currentTime;

            // Update the possible temperature range
            minTemp -= timeDiff;
            maxTemp += timeDiff;

            // Find the intersection of the current temperature range and the customer's range
            minTemp = Math.max(minTemp, l);
            maxTemp = Math.min(maxTemp, h);

            // If there's no overlap, it's impossible to satisfy this customer
            if (minTemp > maxTemp) {
                isPossible = false;
                break;
            }

            // Update the current time
            currentTime = t;
        }

        // Output the result
        System.out.println(isPossible ? "YES" : "NO");

        scanner.close();
    }
}

package codeforce_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kelvin_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int points = 0;
            long s = 0;
            for (int i = n - 1; i >= 0; i--)
            { s += arr[i];
                if (s % 2 == 0) {
//                    points++;
                    while (s % 2 == 0) {
                        points++;
                        s /= 2; }
                }
            }
            System.out.println(points);

        }
    }

}

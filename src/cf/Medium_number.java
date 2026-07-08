package cf;

import java.util.Arrays;
import java.util.Scanner;

public class Medium_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            Arrays.sort(arr);
            System.out.println(arr[1]);

        }
    }
}

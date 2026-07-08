package cf;

import java.util.Scanner;

public class div6_mul2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int cnt2 = 0, cnt3 = 0;
            long orig = n;

            while (n % 2 == 0) {
                n /= 2;
                cnt2++;
            }
            while (n % 3 == 0) {
                n /= 3;
                cnt3++;
            }

            if (n != 1 || cnt2 > cnt3) {
                System.out.println(-1);
            } else {
                int result = (cnt3 - cnt2) + cnt3;
                System.out.println(result);
            }
        }
    }
}

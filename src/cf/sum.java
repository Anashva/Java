package cf;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long z = sc.nextLong();

            if (n == 1) {
                if (z == 0)
                    System.out.println(-1);
                else
                    System.out.println(z);
            } else if (n == 2) {
                if (z == 0) {
                    System.out.println(n);
                } else {
                    long a = 1;
                    long b = a ^ z;
                    if (b == 0 || b == a)
                        System.out.println(-1);
                    else
                        System.out.println(a + b);
                }
            } else {
                long x = 1 ^ 2 ^ z;
                if (x == 0 || x == 1 || x == 2) {

                    long a = 1 << 17;
                    long b = 1 << 18;
                    long c = a ^ b ^ z;
                    if (c == a || c == b || c <= 0) b++; // fix conflicts
                    long sum = (n - 3) + a + b + c;
                    System.out.println(sum);
                } else {
                    long sum = (n - 3) + 1 + 2 + x;
                    System.out.println(sum);
                }
            }
        }
        }
}

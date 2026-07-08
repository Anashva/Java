package Digit_DP;


import java.util.*;

public class  d_s{
    static long[][][][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String l = sc.next();
            String r = sc.next();

            // DP for right
            dp = new long[r.length() + 1][2][2][145];
            for (long[][][] a : dp)
                for (long[][] b : a)
                    for (long[] c : b)
                        Arrays.fill(c, -1);

            long right = count(r, 0, 1, 0, 1);

            // DP for left-1
            long left = 0;
            if (!l.equals("0")) {
                String lm1 = subtract(l);
                dp = new long[lm1.length() + 1][2][2][145];
                for (long[][][] a : dp)
                    for (long[][] b : a)
                        for (long[] c : b)
                            Arrays.fill(c, -1);

                left = count(lm1, 0, 1, 0, 1);
            }

            System.out.println(right - left);
        }
    }

    public static long count(String s, int idx, int tight, int sum, int lz) {
        if (idx == s.length()) {
            return sum;
        }

        if (dp[idx][tight][lz][sum] != -1) {
            return dp[idx][tight][lz][sum];
        }

        int ub = (tight == 1) ? s.charAt(idx) - '0' : 9;
        long ans = 0;

        for (int digit = 0; digit <= ub; digit++) {
            int newt = (tight == 1 && digit == ub) ? 1 : 0;
            int newlz = (lz == 1 && digit == 0) ? 1 : 0;
            int newsum = (newlz == 1) ? sum : sum + digit;

            ans += count(s, idx + 1, newt, newsum, newlz);
        }

        return dp[idx][tight][lz][sum] = ans;
    }

    public static String subtract(String s) {
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (i >= 0 && sb.charAt(i) == '0') {
            sb.setCharAt(i, '9');
            i--;
        }

        if (i < 0) return "0";

        sb.setCharAt(i, (char) (sb.charAt(i) - 1));

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}

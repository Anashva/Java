package lecture_15;
import java.util.Arrays;
import java.util.Scanner;
public class Aggressive_cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int nc = sc.nextInt();
            int[] stall = new int[n];
            for (int i = 0; i < n; i++) {
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largest_minimum(stall, nc));
            t--;
        }

    }

    public static int largest_minimum(int[] stall, int nc) {
        int l = 0;
        int h = stall[stall.length - 1] - stall[0];
        int ans = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (isitpossible(stall, nc, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] stall, int nc, int mid) {
        int pos = stall[0];
        int cow = 1;
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - pos >= mid) {
                cow++;
                pos = stall[i];
            }
            if (cow == nc) {
                return true;
            }
        }
        return false;

    }
}

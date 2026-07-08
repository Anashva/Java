package CODE_FORCES;
import java.util.*;
public class Rizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            if (!isPossible(n, m, k)) {
                System.out.println("-1");
            } else {
                System.out.println(binary(n, m, k));
            }
        }
    }
    public static boolean isPossible(int n,int m, int k){
        int l=n+m;
        return k<=l && k >= Math.max(n, m);
    }
    public static String binary(int n,int m, int k){
        StringBuilder sb = new StringBuilder();
        int zero = 0, one= 0;
        boolean placeOne = m > n;
        for (int i = 0; i < n + m; i++) {
            if (placeOne && m > 0) {
                sb.append('1');
                one++;
                m--;
            } else if (!placeOne && n > 0) {
                sb.append('0');
                zero++;
                n--;
            }
            placeOne = (one - zero <= k) ? !placeOne : placeOne;
        }
        return sb.toString();
    }
}

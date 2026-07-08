package assignment4;
import java.util.*;
public class Parantha {
        private static boolean canCookAll(int[] ranks, int paranthas, int time) {
            int count = 0;
            for (int rank : ranks) {
                int t = 0, k = 1;
                while (t + k * rank <= time) {
                    t += k * rank;
                    count++;
                    k++;
                    if (count >= paranthas)
                        return true;
                }
            }
            return false;
        }
        private static int minTime(int paranthas, int[] ranks) {
            int low = 0, high = ranks[0] * paranthas * (paranthas + 1) / 2, minTime = high;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (canCookAll(ranks, paranthas, mid)) {
                    minTime = mid;
                    high = mid - 1;
                } else low = mid + 1;
            }
            return minTime;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int P = sc.nextInt(), L = sc.nextInt();
            int[] ranks = new int[L];
            for (int i = 0; i < L; i++)
                ranks[i] = sc.nextInt();
            Arrays.sort(ranks);
            System.out.println(minTime(P, ranks));
            sc.close();
        }

}









































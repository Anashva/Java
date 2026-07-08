package CODE_FORCES;
import java.util.*;
public class semi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println(countSemiPrimePairs(arr));
        }
    }

    private static int countSemiPrimePairs(int[] arr) {
        int count = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isSemiPrime(lcm(arr[i], arr[j]))){
                    count++;
                }
            }
        }
        return count;
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static boolean isSemiPrime(int num) {
        int count = 0;
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num /= i;
                count++;
            }
            if (count > 2) {
                return false;
            }
        }
        if (num > 1) count++;
        return count == 2;
    }
}

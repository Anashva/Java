package cf;
import java.util.*;
public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < x; i++)
                ans.add(i);
            for (int i = n - 1; i > x; i--)
                ans.add(i);
            if (x < n)
                ans.add(x);
            for (int i = 0; i < ans.size(); i++) {
                if (i > 0)
                    System.out.print(" ");
                System.out.print(ans.get(i));
            }
            System.out.println();
        }

    }
}

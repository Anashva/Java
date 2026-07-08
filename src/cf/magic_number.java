package cf;

import java.util.Scanner;

public class magic_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        for (int i = 0; i < s.length(); ) {
            if (i + 3 <= s.length() && s.substring(i, i + 3).equals("144")) {
                i += 3;
            } else if (i + 2 <= s.length() && s.substring(i, i + 2).equals("14")) {
                i += 2;
            } else if (s.charAt(i) == '1') {
                i += 1;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

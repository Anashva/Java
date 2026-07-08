package cf;

import java.util.Scanner;
public class delete_left {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        String t=sc.next();
//        int i=s.length()-1;
//        int j=t.length()-1;
//        int c=0;
//        while(i>=0 && j>=0 && s.charAt(i)==t.charAt(j)){
//            c++;
//            i--;
//            j--;
//        }
//        int ans=(s.length()-c)+(t.length()-c);
//        System.out.println(ans);
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // number of test cases

    while (t-- > 0) {
        int n = sc.nextInt();
        int[] a = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        // Check if min + max is even
        if ((min + max) % 2 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
}



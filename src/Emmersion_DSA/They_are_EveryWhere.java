package Emmersion_DSA;

import java.util.*;
public class They_are_EveryWhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int distinct = mp.size();
        int start = 0;
         int end = 0;
        int ans = Integer.MAX_VALUE;
        int c = 0;
        mp.clear();
        while (end < n) {
            mp.put(s.charAt(end), mp.getOrDefault(s.charAt(end), 0) + 1);
            if (mp.get(s.charAt(end)) == 1) {
                c++;
            }
            while (c == distinct) {
                ans = Math.min(ans, end - start + 1);
                mp.put(s.charAt(start), mp.get(s.charAt(start)) - 1);
                if (mp.get(s.charAt(start)) == 0) {
                    mp.remove(s.charAt(start));
                    c--;
                }
                start++;
            }
            end++;
        }
        System.out.println(ans);
    }
}

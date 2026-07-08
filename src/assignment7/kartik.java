package assignment7;
import java.util.*;
public class kartik{
    public static int getMaxActiveSections(String s) {
        // Augment the string
        String t = "1" + s + "1";
        char[] arr = t.toCharArray();
        int n = arr.length;

        // Convert the array for easier processing
        List<Integer> sections = new ArrayList<>();
        int i = 0;

        while (i < n) {
            int count = 0;
            char ch = arr[i];

            // Count contiguous '1's or 'e's
            while (i < n && arr[i] == ch) {
                count++;
                i++;
            }

            // Store segment size
            sections.add(count);
        }

        int maxActive = 0, sum = 0;
        for (int num : sections) sum += num;

        // Find the optimal trade
        for (int j = 1; j < sections.size() - 1; j++) {
            if (sections.get(j - 1) > 0 && sections.get(j + 1) > 0) {
                int tradeValue = sections.get(j - 1) + sections.get(j + 1);
                maxActive = Math.max(maxActive, sum - sections.get(j) + tradeValue);
            }
        }

        return maxActive;
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(getMaxActiveSections("01")); // Output: 1
        System.out.println(getMaxActiveSections("0100")); // Output: 4
        System.out.println(getMaxActiveSections("1000100")); // Output: 7
    }
}



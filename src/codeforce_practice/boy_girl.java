package codeforce_practice;

import java.util.Scanner;
import java.util.*;
public class boy_girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        int result=0;

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of operations
            int m = scanner.nextInt(); // Side length of the square stamp
            Set<String> coveredCells = new HashSet<>(); // To track unique cells
            int perimeter = 0;

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                // Cover the m x m region for this stamp
                for (int dx = 0; dx < m; dx++) {
                    for (int dy = 0; dy < m; dy++) {
                        String cell = (x + dx) + "," + (y + dy);
                        if (!coveredCells.contains(cell)) {
                            coveredCells.add(cell);
                            perimeter += 4; // Add 4 for the new cell
                            // Check neighbors and adjust perimeter for shared edges
                            if (coveredCells.contains((x + dx - 1) + "," + (y + dy))) perimeter -= 2; // Left neighbor
                            if (coveredCells.contains((x + dx) + "," + (y + dy - 1))) perimeter += 2; // Bottom neighbor
                        }
                    }
                }
            }

            // result.append(perimeter).append("\n");
            result=perimeter;
            System.out.println(result);
        }
//        Scanner sc=new Scanner(System.in);
//        String s= sc.next();
//        int c=0;
//        for(int i=0;i<s.length()-1;i++){
//            if(s.charAt(i)!=s.charAt(i+1)){
//                c++;
//            }
//        }
//        if(c%2==0){
//            System.out.println("CHAT WITH HER");
//        }
//        else{
//            System.out.println("IGNORE HIM!");
//        }
    }
}

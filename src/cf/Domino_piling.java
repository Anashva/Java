package cf;

import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int area=m*n;
        System.out.print(area/2);
    }
}

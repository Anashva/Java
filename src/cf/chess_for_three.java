package cf;

import java.util.Scanner;

public class chess_for_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] log=new int[n];
        for(int i=0;i<n;i++){
            log[i]=sc.nextInt();
        }
        int spec=3;
        for(int i=0;i<n;i++){
            int win=log[i];
            if(win==spec){
                System.out.println("NO");
                return;
            }
            int lose=6-win-spec;
            spec=lose;
        }
        System.out.println("YES");
    }
}

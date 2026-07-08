package CODE_FORCES;

import java.util.Scanner;

public class cut_triangle {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int x3=sc.nextInt();
            int y3=sc.nextInt();
            if((x1==x2 || x2==x3 || x1==x3) && (y1==y2 || y2==y3 || y3==y1)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}

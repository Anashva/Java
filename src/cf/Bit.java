package cf;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n-->0){
            String s=sc.next();
            if(s.startsWith("++")){
                ++x;
            }
            else if(s.startsWith("--")){
                --x;
            }
            else if(s.endsWith("++")){
                x++;
            }
            else if(s.endsWith("--")) {
                x--;
            }
        }
        System.out.print(x);
    }
}

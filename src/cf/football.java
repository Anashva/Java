package cf;

import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int c=0;
        int k=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==k){
                c++;
                k= s.charAt(i);
                if(c>6){
                    System.out.println("YES");
                    return;
                }
            }
            else {
                c=0;
                k=s.charAt(i);
            }
        }
        if(c>=7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

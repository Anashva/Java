package cf;

import java.util.Scanner;

public class trippi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            String s3=sc.next();
            System.out.println(s1.charAt(0)+""+s2.charAt(0)+""+s3.charAt(0));
        }
    }
}

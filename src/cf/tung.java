package cf;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class tung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
        int k=15 ^ 15;// + 15 ^ 13 + 15 ^4  + 15 ^5;
        System.out.println(k);
//        while(t-->0){
//            String p=sc.next();
//            String s=sc.next();
//            if(check(p,s)){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//        }
    }
    public static boolean check(String p,String s){
        int i=0,j=0;
        while(i<p.length() && j<s.length()){
            char ch=p.charAt(i);
            int c=0;
            while(j<s.length()){
                if(s.charAt(j)==ch){
                    c++;
                    j++;
                }
            }
            i++;
        }
        if(i==p.length() && j==s.length()){
            return true;
        }
        return false;
    }
}

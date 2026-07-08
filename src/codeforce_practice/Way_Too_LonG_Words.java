package codeforce_practice;

import java.util.Scanner;

public class Way_Too_LonG_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0){
            String s= sc.next();
            int x=s.length();
            if(x>10){
                int k=x-2;
                char str1=s.charAt(0);
                char  str2=s.charAt(s.length()-1);
                System.out.println(str1+""+k+str2);
            }
            else{
                System.out.println(s);
            }
        }
    }
}

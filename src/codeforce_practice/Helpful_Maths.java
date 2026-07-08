package codeforce_practice;

import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String s="";
        for(int i=0;i< str.length()-2;i++){
            if(i%2==0){
                int ch=str.charAt(i)-'0';
                int ch1=str.charAt(i+2)-'0';
                if(ch1<ch){
                    int t=ch;
                    ch=ch1;
                    ch1=t;
                    s+=ch1;
                }
                else {
                    s += ch;
                }
            }
            else{
                s+='+';
            }
        }
        System.out.println(s);
    }
}

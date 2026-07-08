package Assignment_5;

import java.util.Scanner;

public class String_toggle_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String k="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String str = Character.toString(ch);
            if(Character.isUpperCase(ch)){
                k+=str.toLowerCase();
           }
            else{
                k+=str.toUpperCase();
            }
        }
        System.out.print(k);
    }
}

package Assignment_5;

import java.util.Scanner;

public class string_difference_in_ascii_code {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            int k=(int)ch2-(int)ch1;
            str+=s.charAt(i);
            str+=k;
        }
        str+=s.charAt(s.length()-1);
        System.out.print(str);
    }
}

package Assignment_5;

import java.util.Scanner;

public class can_you_read_this {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( Character.isUpperCase(ch)){
                System.out.println();
                System.out.print(ch);

                }
            else{
                System.out.print(ch);
            }
        }

    }
}

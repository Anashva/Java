package Assignment_5;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                int k=(int)ch+1;
                str+=(char)k;
            }
            else{
                int j=(int)ch-1;
                str+=(char)j;
            }
        }
        System.out.print(str);
    }
}

package Assignment_5;

import java.util.Scanner;

public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String k="";
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1!=ch2){
                k+=ch1;
            }
        }
        k+=s.charAt(s.length()-1);
        System.out.print(k);
    }
}

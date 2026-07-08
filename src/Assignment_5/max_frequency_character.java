package Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class max_frequency_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch=s.charAt(0);
        int c=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                c++;
//                ch=s.charAt(i);
            }
            else{
                c--;
                if(c==0){
                    ch=s.charAt(i);
                    c=1;
                }
            }

        }
        System.out.print(ch);
    }
}

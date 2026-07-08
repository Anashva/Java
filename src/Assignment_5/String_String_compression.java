package Assignment_5;

import java.util.Scanner;

public class String_String_compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        int c=1;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch){
                c++;
            }
            else{
                if(c==1){
                    str+=s.charAt(i-1);
                    ch=s.charAt(i);
                }
                else{
                    str+=s.charAt(i-1);
                    str+=c;
                    c=1;
                    ch=s.charAt(i);
                }
            }
        }
        if(c==1){
            str+=s.charAt(s.length()-1);
        }
        else{
            str+=s.charAt(s.length()-1);
            str+=c;
        }

        System.out.print(str);
    }
}

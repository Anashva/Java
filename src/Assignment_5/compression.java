package Assignment_5;

import java.util.Scanner;

public class compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        int c=1;
        char ch1=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch1){
                c++;
            }
            else{
                str+=s.charAt(i-1);
                str+=c;
                c=1;
                ch1=s.charAt(i);

            }

        }
        str+=s.charAt(s.length()-1);
        str+=c;
        System.out.print(str);
    }
}

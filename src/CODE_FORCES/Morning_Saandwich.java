package CODE_FORCES;

import java.util.Scanner;

public class Morning_Saandwich {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int b= sc.nextInt();
            int c= sc.nextInt();
            int h= sc.nextInt();
           if((b>c && b>h) && c==h){
               System.out.println(c+h+1);
           }
           else if(b>c && b>h){
               System.out.println(b-(c+h));
           }
           else if(b<c && b<h){
               if(c<h){
                   System.out.println(h-b);
               }
               else{
                   System.out.println(c-b);
               }
           }
            t--;
        }

    }
}

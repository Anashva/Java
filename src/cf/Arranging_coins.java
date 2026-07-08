package cf;

import java.util.Scanner;

public class Arranging_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            int add=0;
            int rmv=0;
            for(int i=0;i< s2.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    if(s1.charAt(i)=='0'){
                        add++;
                    }
                    else {
                        rmv++;
                    }
                }
            }
            System.out.println(Math.max(add,rmv));
        }
    }
}

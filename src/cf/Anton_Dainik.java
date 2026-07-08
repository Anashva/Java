package cf;

import java.util.Scanner;

public class Anton_Dainik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='D'){
                c++;
            }
        }
        int d=n-c;
        if(c>d){
            System.out.println("Danik");
        } else if (d>c) {
            System.out.println("Anton");
        }
        else{
            System.out.println("Friendship");
        }
    }
}

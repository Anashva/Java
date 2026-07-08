package cf;

import java.util.Scanner;

public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            int s3=sc.nextInt();
            int s4=sc.nextInt();
            int p1=0;
            int p2=0;
            if(s1>s2 && s3>s4){
                p1=s1;
                p2=s3;
                if(s1<s4){
                    System.out.println("NO");
                }
                else if(s3<s2){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            else if(s1>s2 && s4>s3){
                p1=s1;
                p2=s4;
                if(s1<s3){
                    System.out.println("NO");
                }
                else if(s4<s2){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            else if(s2>s1 && s3>s4){
                p1=s2;
                p2=s3;
                if(s2<s4){
                    System.out.println("NO");
                }
                else if(s3<s1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            else if(s2>s1 && s4>s3){
                p1=s2;
                p2=s4;
                if(s2<s3){
                    System.out.println("NO");
                }
                else if(s4<s1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}

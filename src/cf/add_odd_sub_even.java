package cf;

import java.util.Scanner;
public class add_odd_sub_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                int d=a-b;
                if(d%2==0){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
            else if(a<b){
                int c=b-a;
                if(c%2==1){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
            else if(a==b){
                System.out.println(0);
            }
        }
    }
}

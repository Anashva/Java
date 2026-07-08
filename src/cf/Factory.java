package cf;
import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(fac(a,m));

    }
    public static String fac(int a,int m){
        int x=a;
        int k=m;
        while(k-->0){
            if(a%m==0){
                return "Yes";
            }
            a+=a%m;
            if(a==x){
                return "No";
            }
        }

        return "Yes";
    }
}
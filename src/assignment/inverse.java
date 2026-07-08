package assignment;
import java.util.*;
public class inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int p=1;
        while(n>0){
            int d=n%10;
            ans+=p*Math.pow(10,d-1);
            n=n/10;
            p++;
        }
        System.out.println(ans);
    }
}

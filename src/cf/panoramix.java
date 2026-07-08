package cf;

import java.util.Scanner;

public class panoramix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int prm=-1;
        for (int i=n+1;i<=50;i++){
            if(prime(i)){
                prm=i;
                break;
            }
        }
        if (prm==m){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static boolean prime(int n){
        int c=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>1){
            return false;
        }
        return true;
    }

}

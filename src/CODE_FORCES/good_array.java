package CODE_FORCES;

import java.util.Scanner;

public class good_array {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            float n= sc.nextFloat();
            float k=sc.nextFloat();
            if((n-1)%k==0){
                System.out.println((int) (Math.ceil(n/k)));
            }
            else{
                System.out.println((int) (Math.ceil(n/k))+1);
            }
            t--;
        }
    }
}

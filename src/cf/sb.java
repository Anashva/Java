package cf;

import java.util.Scanner;

public class sb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            boolean one=false;
            boolean zero=false;
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if (arr[i]%2==0){
                    zero=true;
                }
                else {
                    one=true;
                }
            }
            if(zero && one){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

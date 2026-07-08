package cf;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=(double)arr[i]/100;
        }
        double result=(sum/n)*100;
        System.out.println(String.format("%.12f", result));
    }
}

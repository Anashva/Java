package assignment;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Alex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]= sc.nextInt();
            }
            int maximum_sum=0;
            for(int i=0;i<n;i++){
                maximum_sum=maximum_sum+array[(i+1)%n]+array[(i-1+n)%n];
            }
            System.out.println(maximum_sum);
            t--;
        }

    }
}

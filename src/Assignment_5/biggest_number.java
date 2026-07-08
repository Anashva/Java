package Assignment_5;

import java.util.Scanner;

public class biggest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    long n1=arr[j];
                    long n2=arr[j+1];
                    String s1=Long.toString(n1);
                    String s2=Long.toString(n2);
                    String str1=s1+s2;
                    String str2=s2+s1;
                    long m1=Long.parseLong(str1);
                    long m2=Long.parseLong(str2);
                    if(m2>m1){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
           StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(arr[i]);
            }
            System.out.print(sb);
        }


    }
}

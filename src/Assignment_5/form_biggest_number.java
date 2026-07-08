package Assignment_5;

import java.util.Scanner;

public class form_biggest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String str="";
        while(t-->0){
            for(int i=n-1;i>=0;i--){
                String ch=Integer.toString(arr[i]);
                str+=ch;
            }
            int k=Integer.valueOf(str);
            System.out.println(k);

        }

    }
}

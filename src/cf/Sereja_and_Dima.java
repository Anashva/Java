package cf;

import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ssum=0;
        int dsum=0;
        boolean flag=true;
        int i=0;
        int j=n-1;
        while(n-->0){
            if(flag==true){
                if(arr[i]<arr[j]){
                    ssum+=arr[j];
                    j--;
                }
                else{
                    ssum+=arr[i];
                    i++;
                }
                flag=false;
            }
            else{
                if(arr[i]<arr[j]){
                    dsum+=arr[j];
                    j--;
                }
                else{
                    dsum+=arr[i];
                    i++;
                }
                flag=true;
            }

        }
        System.out.println(ssum+" "+dsum);
    }
}

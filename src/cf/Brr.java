package cf;

import java.util.Arrays;
import java.util.Scanner;

public class Brr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [][] arr=new int[n][n];
            int[] ans=new int[2*n];
//            Arrays.fill(ans, -1);
            for (int i=0;i<n;i++){
                for (int j=0;j<n; j++){
                    arr[i][j]=sc.nextInt();
                    ans[i+j+1]=arr[i][j];
                }
            }
            int k=0;
            for(int i=1;i<=2*n;i++){
                k+=i;
            }
            int s=0;
            for(int i=0;i<ans.length;i++){
                if(ans[i]!=0){
                    s+=ans[i];
                }
            }
            int d=k-s;
            for (int i=0;i<ans.length;i++){
                if(ans[i]==0){
                    System.out.print(d+" ");
                    d++;
                }
                else{
                    System.out.print(ans[i]+" ");
                }
            }
            System.out.println();

        }
    }
}

package assignment4;

import java.util.Scanner;

public class lower_traingular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int s=0;
        int k=n-1;
        while(k>0){
            s=s+k;
            k--;
        }
        int c=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    if(matrix[i][j]==0){
                        c++;
                    }
                }
            }
        }
        if(c==s){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}

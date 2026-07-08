package assignment4;

import java.util.Scanner;

public class column_maximum_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int s=0;
            int max_index=0;
            for(int j=0;j<n;j++){
                s=s+matrix[j][i];

            }
            ans=Math.max(ans,s);
            max_index=i+1;
        }

        System.out.print(ans);
    }
}

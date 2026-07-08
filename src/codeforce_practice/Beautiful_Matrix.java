package codeforce_practice;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=5;
        int m=5;
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int r=0;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    r=i;
                    c=j;
                    break;
                }
            }
        }
        int sum=Math.abs(2-r)+Math.abs(2-c);
        System.out.println(sum);
    }
}

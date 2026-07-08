package assignment4;

import java.util.Scanner;

public class upper_triangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] matrix1=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(i<=j){
                    matrix1[i][j]=matrix[i][j];
                }
                else{
                    matrix1[i][j]=0;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
}

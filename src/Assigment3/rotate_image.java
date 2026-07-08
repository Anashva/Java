package Assigment3;

import java.util.Scanner;

public class rotate_image {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int k=0;
            int j=matrix[0].length-1;
            while(k<j){
                int t=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=t;
                k++;
                j--;
            }
        }
        int[][] rotate=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotate[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotate[i][j]+" ");
            }
            System.out.println();
        }

    }

}
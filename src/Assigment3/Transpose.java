package Assigment3;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] matrix=new int[N][N];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int[][] transpose=new int[N][N];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

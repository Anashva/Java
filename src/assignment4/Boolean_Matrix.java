package assignment4;

import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        boolean[] matrix1=new boolean[m];
        boolean[] matrix2=new boolean[n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1 ){
                    matrix1[i]=true;
                    matrix2[j]=true;
                }
            }
        }
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix1[i] || matrix2[j]){
                    matrix[i][j]=1;
                }
            }
        }
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

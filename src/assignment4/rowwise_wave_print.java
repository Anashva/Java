package assignment4;

import java.util.Scanner;

public class rowwise_wave_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+", ");
                }
            }
            else{
                for(int j=n-1;j>-1;j--){
                    System.out.print(matrix[i][j]+", ");
                }
            }
        }
        System.out.print("END");
    }
}

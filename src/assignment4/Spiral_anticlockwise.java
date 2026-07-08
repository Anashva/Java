package assignment4;

import java.util.Scanner;

public class Spiral_anticlockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int minc=0;
        int minr=0;
        int maxc=matrix[0].length-1;
        int maxr= matrix.length-1;
        int c=0;
        int te= matrix.length * matrix[0].length;
        while(c<te){
            for(int i=minr;i<=maxr && c<te;i++){
                System.out.print(matrix[i][minc]+", ");
                c++;
            }
            minc++;
            for(int i=minc;i<=maxc && c<te;i++){
                System.out.print(matrix[maxr][i]+", ");
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<te;i--){
                System.out.print(matrix[i][maxc]+", ");
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<te;i--){
                System.out.print(matrix[minr][i]+", ");
                c++;
            }
            minr++;
        }
        System.out.print("END");

    }
}

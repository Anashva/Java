package assignment4;

import java.util.Scanner;
public class Diagonal_traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr=new int[m*n];
        int i=0;
        int j=0;
        for(int k=0;k<arr.length;k++){
            arr[k]=matrix[i][j];
            if((i+j)%2==0){
                if(j==n-1){
                    i++;
                }
                else if(i==0){
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==m-1){
                    j++;
                }
                else if(j==0){
                    i++;
                }
                else{
                    j--;
                    i++;
                }
            }
        }
        for (int k=0;k<m*n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

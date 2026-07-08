package leetcode;

import java.util.Scanner;

public class search_2D_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c=0;
        int target= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if(arr[i][j]==target){
                    c=c+1;
                }
                else{

                }
            }
        }
        if(c==1){
            System.out.println(true);
            System.out.println(c);
        }
        else{
            System.out.println(false);
        }

    }
}

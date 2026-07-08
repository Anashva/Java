package assignment4;

import java.util.Scanner;

public class Piyush_Magical_Park {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char[][] matrix=new char[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char ch=matrix[i][j];
                if(ch=='.'){
                    s=s-3;
                }
                else if(ch=='*'){
                    s=s+4;
                }
                else if(ch=='#'){
                    break;
                }
                if(j<m-1){
                    s=s-1;
                }
            }
        }
        if(s>k){
            System.out.print("YES");
            System.out.print(s);
        }
        else{
            System.out.print("NO");
        }

    }
}

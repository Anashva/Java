package CODE_FORCES;

import java.util.Scanner;

public class Bishop {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            char [][] board=new char[8][8];
            for (int i = 0; i < 8; i++) {
                board[i]= sc.nextLine().toCharArray();

            }

            for(int i=1;i<=7;i++){
                for(int j=1;j<=7;j++){
                    if(board[i][j]=='#' && i==j){
                        System.out.println(i+" "+j);
                        break;
                    }
                }
            }
            t--;
        }
    }
}

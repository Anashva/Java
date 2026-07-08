package Lecture26;

public class N_Queen {
//    most important question
//    prime number-recursion
    public static void main(String[] args) {
        int n=4;
        boolean [][] board=new boolean[n][n];
        queen(board,0,n);
    }
    public static void queen(boolean[][]board,int row,int tq){
        if(tq==0){
            display(board);
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(itissafe(board,row,col)){
                board[row][col]=true;
                queen(board,row+1,tq-1);
                board[row][col]=false;
            }
        }

    }
    public static boolean itissafe(boolean[][] board,int row,int col){
        int r=row;
        while(r>=0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }
//            diagonal right
            r=row;
            int c=col;
            while(r>= 0 && c<board[0].length){
                if(board[r][c]){
                    return false;
                }
                r--;
                c++;
            }
//           diagonal left
        r=row;
        c=col;
        while(r>= 0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
    public static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

    }
}

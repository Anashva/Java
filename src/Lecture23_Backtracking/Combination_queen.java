package Lecture23_Backtracking;

public class Combination_queen {
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean [] board=new boolean[n];
        combination(board,tq,"",0,0);
        System.out.println(count);
    }
    public static void combination(boolean [] board,int tq,String ans,int qpsf,int idx){
        if(qpsf==tq){
            count++;
            System.out.println(ans);
            return;
        }
        for (int i=idx;i<board.length;i++){
            if(board[i]!=true){
                board[i]=true;
                combination(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
                board[i]=false;
            }
        }
    }
}

package Lecture23_Backtracking;

public class math_path {
    public static void main(String[] args) {
        int n = 3;//row
        int m = 3;//col
        horiz_vertic_move(0, 0, n - 1, m - 1, "");
    }
//    cc=current column
//    cr=current row
//    ec=end column
//    er=end row
    public static void horiz_vertic_move(int cc,int cr,int ec,int er,String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec){
            return;
        }
        horiz_vertic_move(cc+1,cr,ec,er,ans+"H");
        horiz_vertic_move(cc,cr+1,ec,er,ans+"V");
    }
}

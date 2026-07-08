package live_clas;

public class chessboard {
    public static void main(String[] args) {
        int n=4;
        printchess(n,0,0,n-1,n-1,"");

    }
    public static void printchess(int n,int cr,int cc,int er,int ec,String ans){
        if(cr==er && cr==cc){
            System.out.println(ans+"{"+cr+"-"+cc+"}"+" ");
            return;
        }
        if(cr>=n || cc>=n){
            return;
        }
//        knight move
        printchess(n,cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}"+"K");
        printchess(n,cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}"+"K");


//        rook move
        if(cr==er || cc==ec || cr==0 || cc==0){
//            horizonatlly
            for(int i=1;i<=n;i++){
                printchess(n,cr,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}"+"R");
            }
//            vertically
            for(int i=1;i<=n;i++){
                printchess(n,cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}"+"R");
            }

        }
//        bishop move
        if(cr==cc || cr+cc==ec){
            for (int i=1;i<=n;i++){
                printchess(n,cr+1,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}"+"B");
            }
        }


    }
}

package Lecture23_Backtracking;

public class coin_permuatation {
    public static void main(String[] args) {
        int[] coin={1,2,3,5};
        int n=5;
        permutation(coin,n,"");
    }
    public static void permutation(int[] coin,int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(n>=coin[i]){
                permutation(coin,n-coin[i],ans+coin[i]);
            }
        }
    }
}

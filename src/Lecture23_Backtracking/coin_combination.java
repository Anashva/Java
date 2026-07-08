package Lecture23_Backtracking;

public class coin_combination {
    static int c=0;
    public static void main(String[] args) {
        int[] coin={1,2,3,5};
        int n=5;
        System.out.println(combination(coin,n,"",0));
    }
    public static int  combination(int[] coin,int n,String ans,int idx){
        if(n==0) {
            c++;
            System.out.println(ans);
//            return 1;
        }
        for(int i=idx;i<coin.length;i++){
            if(n>=coin[i]){
                combination(coin,n-coin[i],ans+coin[i],i);
            }
        }
        return c;
    }
}

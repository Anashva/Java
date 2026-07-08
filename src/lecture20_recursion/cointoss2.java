package lecture20_recursion;

public class cointoss2 {
    public static void main(String[] args) {
        int n=3;
        cointoss(n,"");
    }
    public static void cointoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='T') {
            cointoss(n-1,ans+"T");
        }
        cointoss(n-1,ans+"H");
    }

}

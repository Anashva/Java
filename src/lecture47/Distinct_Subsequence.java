package lecture47;

public class Distinct_Subsequence {
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabbit";
        System.out.println(DS(s,t,0,0));
    }
//    s-->coin,t-amount ko , i=coin ,j=amount
    public static int DS(String s,String t,int i,int j){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=DS(s,t,i+1,j+1);
        }
        exc=DS(s,t,i+1,j);
        return inc+exc;
    }
}

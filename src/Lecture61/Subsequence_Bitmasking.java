package Lecture61;

public class Subsequence_Bitmasking {
//    power set
    public static void main(String[] args) {

    }
    public static void Subsequence(String s){
        int n=s.length();
        for (int i=0;i<(1<<n);i++){
            pattern(s,i);
        }
    }
    public static void pattern(String s,int i){
        int idx=0;
        String ans="";
        while(i>0){
            if((i&1)==1){
                ans=ans+s.charAt(idx);
            }
            i>>=1;
            idx++;
        }
    }
}

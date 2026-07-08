package lecture17_string_arrayLIst;
import java.util.*;
public class substring_length {
    public static void main(String[] args) {
        String s="abcabc";
        printsubstinrg(s);
    }
    public static void printsubstinrg(String s){
        int k=2;
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
        }



//        String str = "abc";
//        HashMap<String,Integer> mp=new HashMap<>();
//        int n=s.length();
//        int total=n*(n+1)/2;
//        int start=0;
//        int end=1;
//        for(int i=0;i<total;i++){
//            mp.put(s.substring(start,end),mp.getOrDefault(s.substring(start,end),0)+1);
//            end++;
//            if(end>n){
//                start++;
//                end=start+1;
//            }
//        }
//        int ans=0;
//        for(String str:mp.keySet()){
//            if(mp.get(str)>=k){
//                ans=Math.max(ans,str.length());
//            }
//        }
//        System.out.print(ans);
    }
}

package lecture24_backtracking;
import java.util.*;
public class palindrome_parttion {
    static int count=0;
    public static void main(String[] args) {
        String s="nitin";
        List<List<String>> ans=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        partiton(s,ll,ans);
        System.out.println(ans);
        System.out.println(count);
    }
     public static void partiton(String ques,List<String> ll,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<String>(ll));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s=ques.substring(0,cut);
            if(ispall(s)) {
                count++;
                ll.add(s);
                partiton(ques.substring(cut),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
     }
    public static boolean ispall(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

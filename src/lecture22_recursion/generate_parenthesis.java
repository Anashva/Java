package lecture22_recursion;
import java.util.*;
public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        parenthesis(n,0,0,"",ll);
        System.out.println(ll);
    }
    public static void parenthesis(int n,int closed,int open,String ans,List<String> ll){
        if(closed==n && open==n){
//            System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open>n || closed>open){
            return;
        }
        parenthesis(n,closed,open+1,ans+"(",ll);
        parenthesis(n,closed+1,open,ans+")",ll);
    }
}

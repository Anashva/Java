package assign_package;

import java.util.Stack;

public class min_seq {
    public static void main(String[] args) {
        String s="IIDDDIDI";
        int[] ans=new int[s.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else {
                st.push(i);
            }
        }
        String ss="";
        for (int n:ans){
            ss+=n;
        }
        System.out.print(ss);
    }
}

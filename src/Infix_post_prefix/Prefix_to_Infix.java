package Infix_post_prefix;

import java.util.Stack;

public class Prefix_to_Infix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String> st=new Stack<>();
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                st.push(""+ch);
            }
            else {
                String v1=st.pop();
                String v2=st.pop();
                String res=v1+ch+v2;
                st.push(res);

            }
        }
        System.out.println(st.peek());
    }
}

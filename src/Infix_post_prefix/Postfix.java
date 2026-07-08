package Infix_post_prefix;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                st.push(num);
            }
            else {
                int v2=st.pop();
                int v1=st.pop();
                if(ch=='+'){
                    st.push(v1+v2);
                }
                if(ch=='-') {
                    st.push(v1-v2);
                }
                if (ch=='*'){
                    st.push(v1*v2);
                }
                if(ch=='/') {
                    st.push(v1/v2);
                }
            }
        }
        System.out.println(st.peek());
    }
}

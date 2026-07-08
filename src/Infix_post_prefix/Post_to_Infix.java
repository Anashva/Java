package Infix_post_prefix;

import java.util.Stack;

public class Post_to_Infix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String > st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                st.push(""+ch);
            }
            else {
                String v2=st.pop();
                String v1=st.pop();
                String res="("+v1+ch+v2+")";
                st.push(res);

            }
        }
        System.out.println(st.peek());
    }
}

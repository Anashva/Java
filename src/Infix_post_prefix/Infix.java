package Infix_post_prefix;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String s="1 + 1";//9-8*4/6=>9-32/6=>9-5=>4
        Stack<Integer> st=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                st.push(num);
            }
            else if (st2.size()==0 || ch=='(' || st2.peek()=='(') {
                st2.push(ch);
            }
            else if(ch==')'){
                while(st2.peek()!='('){
                    int v2=st.pop();
                    int v1=st.pop();
                    if(st2.peek()=='-'){
                        st.push(v1-v2);
                    }
                    if(st2.peek()=='+'){
                        st.push(v1+v2);
                    }
                    if(st2.peek()=='*'){
                        st.push(v1*v2);
                    }
                    if(st2.peek()=='/'){
                        st.push(v1/v2);
                    }
                    st2.pop();
                }
                st2.pop();//( pop
            }
            else {
                if(ch=='+' || ch=='-' ){
//                    work
                    int v2=st.pop();
                    int v1=st.pop();
                    if(st2.peek()=='-'){
                        st.push(v1-v2);
                    }
                    if(st2.peek()=='+'){
                        st.push(v1+v2);
                    }
                    if(st2.peek()=='*'){
                        st.push(v1*v2);
                    }
                    if(st2.peek()=='/'){
                        st.push(v1/v2);
                    }
                    st2.pop();
                    st2.push(ch);
                }
                if (ch=='*' || ch=='/'){
                    if (st2.peek()=='*' || st2.peek()=='/'){
                        int v2=st.pop();
                        int v1=st.pop();
                        if(st2.peek()=='*'){
                            st.push(v1*v2);
                        }
                        if(st2.peek()=='/'){
                            st.push(v1/v2);
                        }
                        st2.pop();
                        st2.push(ch);
                    }
                    if (st2.peek()=='+' || st2.peek()=='-'){
                        st2.push(ch);
                    }
                }
            }
        }
        while(st.size()>1){
            int v2=st.pop();
            int v1=st.pop();
            if(st2.peek()=='-'){
                st.push(v1-v2);
            }
            if(st2.peek()=='+'){
                st.push(v1+v2);
            }
            if(st2.peek()=='*'){
                st.push(v1*v2);
            }
            if(st2.peek()=='/'){
                st.push(v1/v2);
            }
            st2.pop();
        }
        System.out.println(st.pop());
    }
}

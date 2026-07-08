package Lecture29_OOPS;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(30);
        st.push(10);
//        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
//        TC=O(N2)
        if(st.empty()){
            return;
        }
        int x=st.pop();
        reverse(st);
        add_last(st,x);
    }
    public static void add_last(Stack<Integer> st,int item){
//        recursion
        if(st.empty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        add_last(st,item);
        st.push(x);
    }
}

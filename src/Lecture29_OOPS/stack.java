package Lecture29_OOPS;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();//default capacity cannot be change
//        default capacity of stack-10
//        size of new  stack grow-2*size of previus size
//        vector grow=2*previous size
//        vector-synchronized(consistency is there)
//        arraylist-not synchronized(inconsistency is there)
//        System.out.println(st.capacity());
//        stack-lifo sementics
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(30);
        st.push(40);
        st.push(50);
        int x=st.peek()+st.peek();
        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st);
        add_last(st,6);
        System.out.println(st);
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

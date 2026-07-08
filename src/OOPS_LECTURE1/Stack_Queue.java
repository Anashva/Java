package OOPS_LECTURE1;

import java.util.Stack;

public class Stack_Queue {
    public static void main(String[] args) {
//        stack-data struction which is last In first Out(LIFO)
        Stack<Integer> st=new Stack<>();
//        non premitve-stack
//        add-push
//        remove-pop
//      get-peak
//        isempty
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());//50
        System.out.println(st);//[10, 20, 30, 40, 50]
        System.out.println(st.pop());//50
        System.out.println(st);//[10, 20, 30, 40]
        System.out.println(st.isEmpty());//false
        System.out.println(st.size());//4

    }
}

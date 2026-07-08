package Dynamic_stack_queue;

import java.util.Stack;

public class dqueue_using_stack {
    private Stack<Integer> st;
    public dqueue_using_stack(){

        st=new Stack<>();
    }
    public int size(){

        return st.size();
    }
    public boolean isempty(){

        return st.isEmpty();
    }
    public void Enqueue(int item) {
        Stack<Integer> hlpr=new Stack<>();
        while(!st.isEmpty()){
            hlpr.push(st.pop());
        }
        st.push(item);
        while(!hlpr.isEmpty()){
            st.push(hlpr.pop());
        }
    }
    public int Dequeue(){

        return st.pop();
    }
    public int getfront(){

        return st.peek();
    }

    public static void main(String[] args) {
        dqueue_using_stack q=new dqueue_using_stack();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Enqueue(60);
        System.out.println(q.Dequeue());
        System.out.print(q.getfront());
    }

}

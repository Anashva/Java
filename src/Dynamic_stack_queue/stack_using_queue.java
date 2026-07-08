package Dynamic_stack_queue;

public class stack_using_queue {
    private Dynamic_Queue Q;
    public stack_using_queue(){

        Q=new Dynamic_Queue();
    }
    public int size(){

        return Q.size();
    }
    public boolean isempty(){

        return Q.isempty();
    }
//    O(1)
    public void push(int item) throws  Exception{
        Q.equeue(item);
    }
//    O(N)
    public int pop() throws Exception{
        Dynamic_Queue helpr=new Dynamic_Queue();
        while(Q.size()>1){
            helpr.equeue(Q.dequeue());
        }
        int rv=Q.dequeue();
        while(helpr.size()>0){
            Q.equeue(helpr.dequeue());
        }
        return rv;
    }
//O(N)
    public int peek() throws Exception{
        Dynamic_Queue helpr=new Dynamic_Queue();
        while(Q.size()>1){
            helpr.equeue(Q.dequeue());
        }
        int rv=Q.dequeue();
        helpr.equeue(rv);
        while(helpr.size()>0){
            Q.equeue(helpr.dequeue());
        }
        return rv;
    }

    public static void main(String[] args) throws Exception{
        stack_using_queue st=new stack_using_queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.pop());
        System.out.print(st.peek());
    }
}

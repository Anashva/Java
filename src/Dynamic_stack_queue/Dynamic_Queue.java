package Dynamic_stack_queue;

import OOPS_LECTURE1.queues;

public class Dynamic_Queue extends queues  {
    @Override
    public void equeue(int item) throws Exception{
        if(isfull()){
            int[] ar=new int[2*arr.length];
            for (int i=0;i<arr.length;i++){
                int idx=(front+i)%arr.length;
               ar[i]=arr[idx];
            }
            arr=ar;
            front=0;
        }
        super.equeue(item);
    }

    public static void main(String[] args) throws Exception{
        Dynamic_Queue dq=new Dynamic_Queue();
        dq.equeue(10);
        dq.equeue(20);
        dq.equeue(30);
        dq.equeue(40);
        System.out.println(dq.dequeue());
        System.out.println(dq.dequeue());
        dq.equeue(50);
        dq.equeue(60);
        dq.equeue(70);
        dq.equeue(80);
        dq.Display();
    }
}

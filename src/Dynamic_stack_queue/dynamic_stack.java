package Dynamic_stack_queue;

import OOPS_LECTURE1.stack;

public class dynamic_stack  extends stack {
    @Override
    public void push(int item) throws Exception{
        if(isfull()){
            int[] ar=new int[2*arr.length];
            for (int i=0;i<arr.length;i++){
                ar[i]=arr[i];
            }
            arr=ar;
        }
        super.push(item);
    }

    public static void main(String[] args) throws Exception{
        dynamic_stack ds=new dynamic_stack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
    }
}

package OOPS_LECTURE1;

public class queues {
    protected int [] arr;
    protected int front=0;
    private int size=0;
    public queues(){
        arr=new int[5];
    }
    public queues(int n){

        arr=new int[n];
    }
    public boolean isempty(){

        return size==0;
    }

    public void equeue(int item) throws Exception{
        if(isfull()){
            throw new Exception("baklol queue full hai");
        }
//        int idx=front+size-linear queue
        int idx=(front+size)%arr.length;//circular queue
        arr[idx]=item;
        size++;
    }
    public int dequeue() throws Exception{
        if(isempty()){
            throw new Exception("baklol khali h");
        }
        int rv=arr[front];
//        front++-linear queue
        front=(front+1)%arr.length;//circular queue
        size--;
        return rv;
    }
    public int getFront() throws Exception{
        if(isempty()){
            throw new Exception("baklol khali h");
        }
        int rv=arr[front];
        return rv;
    }
    public boolean isfull(){

        return size==arr.length;
    }
    public int size(){

        return size;
    }
    public  void Display(){
        for(int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();

    }

}

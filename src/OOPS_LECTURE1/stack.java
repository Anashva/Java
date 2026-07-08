package OOPS_LECTURE1;

public class stack {
    protected int[] arr;
    private int idx=-1;
    public stack(){

        arr=new int[5];
    }
    public stack(int n){

        arr=new int[n];
    }
    //O(1)
    public boolean isempty(){

        return idx==-1;//hmare stack me ekbhi elment hai ya nhi
    }
    public  void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("baklol stack full hai");
        }
        idx++;
        arr[idx]=item;
    }
    public int size(){

        return idx+1;
    }
    public boolean isfull(){

        return idx==arr.length-1;
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("baklol stack empty hai");//underflow hai
        }
        int rv=arr[idx];
        idx--;
        return rv;
    }
    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("baklol stack empty hai");
        }
        int rv=arr[idx];
        return rv;
    }
    public void display(){
        for(int i=0;i<=idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

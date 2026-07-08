package lecture31;
//node class=head,tail,size-kitne node hai
public class linkedlist {
    class Node{
        int val;
        Node next;
    }
//    public par koi null kardega to koi bhi change kar dega
    private  Node head;
    private Node tail;
    private int size;
    private   Node  GetNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Baklol k range me nhi hai");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void Addat_indwex(int item,int k) throws Exception{
        if(k==0){
           AddFirst(item);
        }
        else if(k==size){
            Addlast(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            Node prev=GetNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }
    public void Addlast(int item){
        if(size==0){
                AddFirst(item);
    }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void  AddFirst(int item){
//        TC=>O(1)
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println(".");
    }
    public int getFirst(){
        return head.val;
    }
//    O(1)
    public int getLast(){
        return tail.val;
    }
//    O(1)
    public int get_at_index(int k) throws Exception{
        return GetNode(k).val;
    }
//    O(N)
    public int removeFirst(){
//        TC=>O(1)
        int val= head.val;
        if(size==1){
            head=null;
            tail=null;
            size=0;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
            size--;
        }
        return val;
    }
    public int removelast() throws Exception{
        if(size==1){
            return removeFirst();
        }
        else{
            int val=tail.val;
            Node sl=GetNode(size-2);
            sl.next=null;
            tail=sl;
            size--;
            return val;
        }
    }
    public int remove_at_index(int k) throws Exception{
        if(k==0 ){
            return removeFirst();
        }
        else if(k==size-1){
            return removelast();
        }
        else{
            Node prev=GetNode(k-1);
            Node curr=GetNode(k);
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.val;

        }
    }
}

package lecture34_interface;

public class stack_client {
    public static void main(String[] args){
        stack_class st=new stack_class();
//        java 8 se pehele kisi bhi body  ko interface nhi de skte hai but abstract k through de skte hai
//        java 8 se interface ka object bhi n=bana skte hai
        stack_interface st1=new stack_interface() {
            @Override
            public void push(int item) {

            }

            @Override
            public int peek() {
                return 0;
            }
        };
    }
}

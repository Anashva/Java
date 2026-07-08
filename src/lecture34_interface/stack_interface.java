package lecture34_interface;
//C
public interface stack_interface {
    int x=7;// ek bar jo daal diya change nhi kar skte hai
//   ******* NOTE->interface k andar koi varibale banate h to uska access modifier  public static and final hota hai
    public void push(int item);
//    void push(int item);--default
//    interface can never become object
//    queue is in built interface
    public int peek();

//
//    final keyowrd-constant modify nhi kar skte hai
//    overwirte,cannot inherit,not mutubale-final used with variable

//    java 8 -me bana hai aur method ko body nhi de skte hai-java 8 se interface ka object bhi n=bana skte hai
    static  void fun(){

    }
//    java 9 -me bana niche wala
    private  static void fun1(){

    }
}

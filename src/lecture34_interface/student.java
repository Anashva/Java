package lecture34_interface;

public class student {
    final int age=9;
//    public student(int x){
//        this.age=x;// cannnot assign
//    }
    public final void fun(){
//        agr kisi method k sath final laga h to vo inherit or overwrite nhi hoga
    }

    public static void main(String[] args) {
        student s=new student();
//        s.age=9;//cannot assign final variable ki chnage nhi kar skte hai
    }
}

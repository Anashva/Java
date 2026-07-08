package OOPS_LECTURE1;

public class Student_Client {
//    class =blueprint-> just like architect of home
//    jo student class se belong karega uski same property hogi
//    in student classs=name,age,intoduceyourself ye blueprint me  aya hoga
//    blueprint will be there in heap memory
//    stack memory me main method load hoga then student line will run
    public static void main(String[] args) {
//        int k =local variable
        System.out.println("Hello");
//        new student=object,instance
//        s=reference variable
//        student=non preemptive datatype
         Student s=new Student();//student non premitive data type
        System.out.println(s.age);
        System.out.println(s.name);
        s.name="dhoni"; // name=null->dhoni and age=0-> 42 in s memory stack
        s.age=42;
        s.Intro_yourself();
        Student s1=new Student();
//        s1.age=43;
        s1.name="thala";
//        s1.Intro_yourself();
        s1.sayHey("Rohit");
//        Student s2=new Student();
//        s2.name="anashva singh";
//        s2.age=20;
//        s2.Intro_yourself();
        Student.SayMentor();//refernce through class name not variable name
        s1.SayMentor();// it will give warning
        Student s2=new Student();
        s2.age=32;
        s2.name="kohli";
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
//    static {
//        System.out.println("I am a in Static blocks Main");//it will run first then other program will run
//    }
}

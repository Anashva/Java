package Lecture29_OOPS;

//public class Student {
//    String name;
//    int age;
//    public void Intro(){
//        System.out.println("hello "+name+" is "+age);
//    }
//}
class Student{
    String name;
    int age;
    public void Intro(){
        System.out.println("hello "+name +" is "+age);
    }
    public static void main(String[] args) {
        Student s=new Student();//new student()-object
        s.name="kamlesh";
        s.age=16;
        s.Intro();
        Student s1=new Student();
        s1.name="kaju";
        s1.age=22;
        s1.Intro();

    }
}

package Lecture29_OOPS;

public class Student_client {
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

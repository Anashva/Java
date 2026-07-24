package oops_lecture33;

public class Student_client {
//    sbse pehle static block execute hota hai
    public static void main(String[] args) {
        System.out.println("virat");
        student s=new student();
        s.name="kaju";
        s.age=21;
        s.intro();
        student s1=new student();
        s1.name="kamlesh";
        s1.age=22;
        s1.intro();
        s1.say_hey("dhoni");
        System.out.println();

        Class<?> c=s.getClass();
        System.out.println(c.getName());
        System.out.println(c.getMethods());
        System.out.println(c.getSuperclass());
        System.out.println(Object.class.getSuperclass());

    }
    static {
        System.out.println("i am fan of dhoni ");
    }
    static {
        System.out.println("coding block");
    }
}

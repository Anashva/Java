package OOPS_LECTURE1;

public class Student1_client {
    public static void main(String[] args) {
        Student1 s=new Student1("thala",13);
        System.out.println(s.getAge());
        s.setAge(-9);
        System.out.println(s.getAge());
        System.out.println("hey");

    }
}
//main ko jvm n call kiya tha aur jvm ko jaise bhanak lagega vha turant code ko terminate kr dega
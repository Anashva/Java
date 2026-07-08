package OOPS_LECTURE1;

public class Person_client {
    public static void main(String[] args) {
        System.out.println("helloo");
        Person p=new Person("thala",45);//new person is object and person is constructor calling
//        heap memory me 2k location pr new person() k liye momory provide hoga and it will not have null value bcoz name=dhoni
        System.out.println(p.name);
        System.out.println(p.age);
        Person p1=new Person("msd",44);
        System.out.println(p1.name);
        System.out.println(p1.age);
        Person p2=new Person("shri krishna",1000);
        System.out.println(p2.age);
        System.out.println(p2.name);
        p1.setAge(19);

    }
}

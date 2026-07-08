package oops_practice;

import java.util.*;
class Passport {
    Person p;
    Passport(Person p){
        this.p=p;
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.name="anashva";
        Passport pp=new Passport(p);
        System.out.println(pp.toString());
        System.out.println(pp.getClass().getName());
        System.out.println(pp.hashCode());
        System.out.println(p.name);
    }
}

class Teacher{
    List<Student> st=new ArrayList<>();
    public static void main(String[] args) {
        Teacher t=new Teacher();
        Student s1=new Student();
        Student s2=new Student();
        t.st.add(s1);
        t.st.add(s2);
    }
}

class Student{
    String name;
}

class Studens{
    List<Courses> st=new ArrayList<>();
}

class Courses{
    List<Studens> cs=new ArrayList<>();
}
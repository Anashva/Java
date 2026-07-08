package oops_lecture33;

public class student {
    String name;
    int age;
    public void intro(){
        System.out.println("my name is " +name +"  of "+age);
    }
    public void say_hey(String name){
//        this-class k data member ko print krega
        System.out.println(this.name +" hey "+name);
    }
}

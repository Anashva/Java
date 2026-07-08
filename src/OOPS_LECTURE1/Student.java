package OOPS_LECTURE1;
//low level design-oops
public class Student {//class
    String name;// class data member
    int age;
    public void Intro_yourself(){//method
        SayMentor();//non static me static function will be accessable
//        method is non static
        System.out.println("My Name is "+ name+" and age is "+age);
    }
    public void sayHey(String name){
        System.out.println(this.name+" Say Hii "+ name);// we use this keyword due to conflict
//        class ka variable and function ka variable name agr same ho to so we use this keywordfor differentiate
//        due to this keyword ->s reference ka addrees paass hota h this keyword me taki ye bta ske ki class ka data member kon kon sa use kiya gaya h
    }
    public static void SayMentor(){
        System.out.println("Mentor Name Monu Bhaiya");
// name cannnot be access in static field of not static
    }
//    static -pure class se related hota hai
//    static block=>run in our program firstly
//    static {
//        System.out.println("I am a in Static blocks");
//    }
//    static filed me non static access nhi hoti hai
////    this keyword=>
}

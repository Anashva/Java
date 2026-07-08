package OOPS_LECTURE1;

public class Person {
//    this is default access modifier
    String name="Dhoni";//parsing then constructor work // this is default access modifier
    int age=44;
//     private int age=43;
//    private String name="Dhoni";// it is private so that no any user access from outside

    public Person(){
//jab program me ke bhi constructor nhi banaya gya hota h to vo khud se bnata h(runtime me banata hai)
    }
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /// within class access
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void setAge(int age){
////        to update the value from private variable
//        this.age=age;
//    }
//    public int getAge(){
////        to fetch the variable
//        return age;
//    }
}

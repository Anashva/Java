package oops_lecture33;

public class constructor {
    String name="raj";
    int age=20;
    public constructor(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){ //Exception may be exception ho skte
//        danger code-try block
        try {
            if (age < 0) {
                throw new Exception("baklol age -ve nhi hoga");//exception generate krne ko bta rha h
            }
            this.age = age;
        }
        catch (Exception e){
//            handle exceptiom
            e.printStackTrace();
        }
        finally {
            System.out.println("I am in finally");
        }
    }
    public int getAge() {
        return age;
    }
//    public void setage(int age){
//        this.age=age;
//    }
//    public  int getage(){
//        return age;
//    }
}


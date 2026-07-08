package SystemDesign;

public class Child extends Parent{
    String name;
    public Child(String parent,String childn){
        super(parent);
        this.name=childn;
    }
    @Override
    public void fun(String name){
        System.out.println("name->"+ name);
    }

    public static void main(String[] args) {
        Parent p=new Child("PARENT","CHILD");
        p.fun("CHILDS");
    }
}

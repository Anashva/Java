package oops_practice;

public class Child implements Cloneable{
    String name;
    Child(String name){
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException{
        Child s1=new Child("anashva");
        Child s2=(Child) s1.clone();
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

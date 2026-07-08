package oops_practice;

public class Outers {
    static class Inner{
        void print(){
            System.out.println("static nest class");
        }
    }

    public static void main(String[] args) {
        Outers.Inner obj=new Outers.Inner();
        obj.print();
    }
}

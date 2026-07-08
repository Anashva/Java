package oops_practice;

public class Hashing {
    String name;
//    int age;
    @Override
    public int hashCode(){
        int res=17;
        res=31*res+name.hashCode();
//        res=31*res+age;
        return res;
    }

    public static void main(String[] args) {
        Hashing h=new Hashing();
        h.name="ana";
//        h.age=90;
        System.out.println(h.hashCode());
    }
}

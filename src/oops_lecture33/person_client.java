package oops_lecture33;

public class person_client {
    public static void main(String[] args)  {
        constructor p=new constructor("kamal",23);
        System.out.println(p.name);
        System.out.println(p.age);
        p.setAge(-19);
        System.out.println();
    }
}

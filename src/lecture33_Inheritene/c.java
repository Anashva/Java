package lecture33_Inheritene;

public class c extends p{ //c ban gya child aur p parent //parent ka child par hak nhi hota hai
    int d=2;
    int d2=20;
    @Override//due to this code readibilty is easy-runtime polymorphism
    public void fun(){
        System.out.println("fun in c");
    }
    public void fun2(){
        System.out.println("fun2 in c");
    }
}

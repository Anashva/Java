package SystemDesign;

public class Polymporphism {
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymporphism p=new Polymporphism();
        System.out.println(p.add(2,3));
        System.out.println(p.add(2,3,4));
    }
}

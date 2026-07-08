package lecture17_string;

public class wrapper_class {
    public static void main(String[] args) {
//        primitive type:-boolean,byte,int,lonh,char,float,double,short
//        wrapper class:- Boolean,Byte,Character,float,Integer,,Long,Short,Double
//       wrapper class heap me bnta h-stack me bnta h
//        overwrites
        int a=10;
        Integer a1=10;
        System.out.println(a);
        System.out.print(a1);
        Long k=10l;//L-wrapper ,l-primitive
        Character ch='a';
        Boolean b=true;
        Integer x=a;
//        primitve data is transfer to nonprimitive-autoboxing
        int x1=a1;
//                unboxing-non primitve to primitve transfer
//        stack se heap-autoboxing and  heap to stack-unboxing
//        string container address but print content
        Integer c1=18;
        Integer c2=18;
        Integer c3=181;
        Integer c4=181;
        System.out.println(c1==c2);//true beacause it belong to range of arrar of cache
        System.out.println(c3==c4);//false out of range the cache array
        Boolean b1=false;
        Boolean b2=false;
        System.out.println(b1==b2);
        Character y1='2';
        Character y2='2';
        System.out.print(y1==y2);
    }
}

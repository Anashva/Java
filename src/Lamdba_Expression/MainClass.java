package Lamdba_Expression;

import java.util.Date;
import java.util.function.*;

public class MainClass {
    public static void main(String[] args) {
//        Interf f=new InterfImpl();
//        f.m1();

//        Interf f=()->System.out.println("anashva singh");;
//        f.m1();

//        Interf f1=(n)->System.out.println(n*n);;
//        f1.square(10);
//
//        Interf f3=(a,b)->System.out.println(a+b);
//        f3.add(3,4);

//        Interf f4=(a)-> a%2 == 0;
//        System.out.println(f4.check(4));

//
//        Predicate<Integer> p=(n)->n%2==0;
//        System.out.println(p.test(20));

//        Interf f5=(s)-> s.length();
//        System.out.println(f5.len("anashvasingh"));
//
//
//        Predicate<String> p=(a)->a.length()>7;
//        System.out.println(p.test("anashavas"));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThan10 = n -> n > 10;

        Predicate<Integer> result =
                isEven.and(greaterThan10);

        System.out.println(result.test(12)); // true
        System.out.println(result.test(8));  // false



        TriPredicate<Integer,String, Double> check= (age, name, salary) -> age >= 18 && name.length() >= 3 && salary > 10000;
        System.out.println(check.test(22, "John", 25000.0));

        BiPredicate<String,Integer> dp=(a,b)->a.length()>5 && b>2;
        System.out.println(dp.test("anashv",1));


        Function<String,Integer> f=(s)->s.length();
        System.out.println(f.apply("wasif"));


        BiFunction<Integer,Integer,Integer> bf=(a,b)->a+b;
        System.out.println(bf.apply(40,40));




        Function<Integer,Integer> square =
                n -> n*n;

        Function<Integer,Integer> addTen =
                n -> n+10;

        Function<Integer,Integer> res =
                square.andThen(addTen);

        System.out.println(res.apply(5));


        Consumer<String> c=(s)->System.out.println(s);
        c.accept("hello");


        Supplier<String> s=()->"Java";
        System.out.println(s.get());








    }}

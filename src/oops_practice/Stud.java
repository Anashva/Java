package oops_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Stud implements Comparable<Stud>{
    int marks;
    int age;
    Stud(int marks,int age){
        this.marks=marks;
        this.age=age;
    }
    @Override
    public int compareTo(Stud s){
        return this.marks-s.marks;
    }

    public static void main(String[] args) {
        List<Stud> ll=new ArrayList<>();
        ll.add(new Stud(80,20));
        ll.add(new Stud(12,15));
        Collections.sort(ll);
        for (Stud s : ll){
            System.out.println(s.marks);
        }
    }
}

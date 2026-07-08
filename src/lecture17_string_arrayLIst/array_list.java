package lecture17_string_arrayLIst;
import java.util.*;
import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
//        array-it is static means size cannot be resize
//        arraylist-class,non premitive,dynamic
//        we cannot add elemnet to skip the index in arraylist
//
//        syntax-
        ArrayList<Integer> ll=new ArrayList<>();//<> is compulsary in arraylist because it will show unchecked and unsafe operation
        ll.add(10);//O(1)
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
//        ll.reversed();
        System.out.println(ll.reversed());//print in reverse order
        ll.add(1,9);//O(N)
//        System.out.println(ll);
//        ll.add(7,60);//error
//        System.out.println(ll);
//        System.out.println(ll.get(2));//O(1)
        System.out.println(ll.remove(1));
//        System.out.println(ll);
//        System.out.println(ll.size());
//        ll.set(1,101);//to update the value at any index we use set-O(1)
//        System.out.println(ll);
    }
}

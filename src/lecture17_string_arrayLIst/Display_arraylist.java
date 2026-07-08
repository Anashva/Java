package lecture17_string_arrayLIst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Display_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();//size-0 and default capacity-10 of arraylist but accessability nhi h
//        we can chaange the capacity in argument ArrayList<Integer> ll=new ArrayList<>(20)
//       ( old capacity+old capacity/2)-new arraylist size and old arraylist size is taken by garbage collector
//        internally array size banata h 1.5 times of original list and copy all data from original data and then further element
//        List<Integer> ll=new ArrayList<>();
        ll.add(40);//O(1)
        ll.add(11);
        ll.add(30);
        ll.add(13);
        ll.add(50);
        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
        int[] arr=new int[5];
        for(int k :ll){              //for each loop cannot run in reverse order
            System.out.print(k+" ");//both k have different value not link together
        }
        System.out.println();
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
//DNF(dutch national flag)for 3 type element only  algorithm to sort the array=>
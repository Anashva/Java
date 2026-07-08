package lecture31;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> ll=new HashMap<>();
        int[] arr={1,2,20,8,8,1,2,5,8,0};
//        insertion
        ll.put(1,3);
        ll.put(2,1);
        ll.put(4,2);
        ll.put(3,8);
        System.out.println(ll);
//        search
        if(ll.containsKey(2)){
            System.out.println(true);//else false
        }
//        get
        System.out.println(ll.get(1));//null if not present
//        iteration in hashmap-Map.Entry<Integer,Integer> e:Map.entrySet()
        for(Map.Entry<Integer,Integer> e: ll.entrySet()){
            System.out.println(e.getValue());
        }
//        to remove pair
        ll.remove(1);
//        System.out.println;
        for(int i=0;i<10;i++){

        }
    }
}

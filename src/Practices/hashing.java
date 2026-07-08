package Practices;
import java.util.HashMap;
import java.util.HashMap.*;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class hashing {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("India",120);//to insert the value
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
//        search
        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("key is not  present in the map");

        }


//        to get value of key
        System.out.println(map.get("China"));//key exists-180
        System.out.println(map.get("Indonesia"));//key not exists-null
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        map.remove("China");
        System.out.println(map);
    }
}

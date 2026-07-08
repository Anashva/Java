package Lecture40;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class Hashmap_Demo {
    public static void main(String[] args) {
//        HashMap<String,Integer> mp=new HashMap<>();
//        mp.put("Raj",77);
//        mp.put("Ankita",70);
//        mp.put("Raju",89);
//        mp.put("Deepti",100);
//        mp.put("Ayushi",99);
//        mp.put("Manasvi",100);
//        System.out.println(mp);
//        System.out.println(mp.keySet());//its return type is set
//        Set<String> key=mp.keySet();
//        for (String s:key){
//            System.out.println(s+" "+mp.get(s));
//        }
//        get
//        System.out.println(mp.get("Raj"));
//        contains key
//        System.out.println(mp.containsKey("Anita"));
////        remove
//        System.out.println(mp.remove("Kaju"));



        TreeMap<String,Integer> tp=new TreeMap<>();
        tp.put("Raj",77);
        tp.put("Ankita",70);
        tp.put("Raju",89);
        tp.put("Deepti",100);
        tp.put("Ayushi",99);
        tp.put("Manasvi",100);
        System.out.println(tp);



        LinkedHashMap<String,Integer> lp=new LinkedHashMap<>();
        lp.put("Raj",77);
        lp.put("Ankita",70);
        lp.put("Raju",89);
        lp.put("Deepti",100);
        lp.put("Ayushi",99);
        lp.put("Manasvi",100);
        System.out.println(lp);

    }
}

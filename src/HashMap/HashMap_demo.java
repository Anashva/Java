package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
public class HashMap_demo {
    public static void main(String[] args) {
//        HashMap
        HashMap<String,Integer> mp=new HashMap<>();
//        add -put=>Cmplexity->O(1)
        mp.put("ankita",78);
        mp.put("raj",89);
        mp.put("kaju",99);
        mp.put("ankit",59);
        System.out.println(mp);

//         contains->0(1)
        System.out.println(mp.containsKey("ankit"));

//         get
        System.out.println(mp.get("ankit"));
//         remove
        System.out.println(mp.remove("ankita"));
//        size
        System.out.println(mp.size());

//        Set<String> st=mp.keySet();
//        for (String k:st){
//            System.out.println(mp.get(k));
//        }
        for (String k:mp.keySet()){
            System.out.println(mp.get(k));
        }



//        TreeMap
//        TreeMap<String,Integer> mp=new TreeMap<>();
////        add -put=>Cmplexity->O(1)
//        mp.put("ankita",78);
//        mp.put("raj",89);
//        mp.put("kaju",99);
//        mp.put("ankit",59);
//        System.out.println(mp);




//        linkedHashMap
//       LinkedHashMap<String,Integer> mp=new LinkedHashMap<>();
////        add -put=>Cmplexity->O(1)
//        mp.put("ankita",78);
//        mp.put("raj",89);
//        mp.put("kaju",99);
//        mp.put("ankit",59);
//        mp.put(null,90);
//        System.out.println(mp);

    }
}

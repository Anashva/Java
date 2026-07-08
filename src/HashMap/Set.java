package HashMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
//        HashSet->O(1)
        HashSet<Integer> st=new HashSet<>();
//        add-
        st.add(1);
        st.add(3);
        st.add(3);
        st.add(7);
        st.add(2);
        st.add(6);
        System.out.println(st);

        st.remove(3);
        System.out.println(st);
        for (int i:st){
            System.out.println(i);
        }



//        treeset->log(n)
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(3);
        ts.add(7);
        ts.add(2);
        ts.add(6);
        System.out.println(ts);



//        linkedhahset
        LinkedHashSet<Integer> t=new LinkedHashSet<>();
        t.add(1);
        t.add(3);
        t.add(3);
        t.add(7);
        t.add(2);
        t.add(6);
        System.out.println(t);
    }
}

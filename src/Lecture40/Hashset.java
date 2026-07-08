package Lecture40;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(5);
        st.add(1);
        System.out.println(st);
//get
        System.out.println(st.contains(1));
//        remove
        System.out.println(st.remove(3));
        System.out.println(st);


        TreeSet<Integer> t=new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(5);
        t.add(1);
        System.out.println(t);

        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(1);
        System.out.println(l);

    }
}

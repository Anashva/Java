package OOPS_LECTURE1;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Kth_largest_element_pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> ll=new ArrayList<>();
        int k=3;
        pq.add(20);
        pq.add(10);
        pq.add(60);
        pq.add(30);
        pq.add(50);
        pq.add(40);
        while (!pq.isEmpty()){
            ll.add(pq.peek());
            pq.poll();
        }
        System.out.println(ll);
        System.out.println(ll.get(ll.size()-k));
    }
}

package OOPS_LECTURE1;

import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();// work accorind to min heap
//        PriorityQueue<>(Collections.reverseOrder())-work accroding to opposite of prirotyqueue
        pq.add(55);
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.poll();
        }

    }
}

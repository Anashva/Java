package Lecture55;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    private HashMap<Integer,HashMap<Integer,Integer>> mp;
    public Prims_Algorithm(int v){
        mp=new HashMap<>();
        for (int i=1;i<=v;i++){
            mp.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        mp.get(v1).put(v2,cost);
        mp.get(v2).put(v1,cost);
    }
    class PrimsPair{
        int vtx;
        int acq_vtx;
        int cost;
        public PrimsPair(int vtx,int acq_vtx,int cost){
            this.vtx=vtx;
            this.acq_vtx=acq_vtx;
            this.cost=cost;
        }

        @Override
        public String toString() {
            return vtx+" "+acq_vtx+" @"+cost;
        }
    }
    public void PrimsAlgorithm(){
//        PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<PrimsPair>(){
//            @Override
//            public int compare(PrimsPair o1,PrimsPair o2){
//                return o1.cost-o2.cost;
//            }
//        });
        PriorityQueue<PrimsPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        HashSet<Integer> visit=new HashSet<>();
        pq.add(new PrimsPair(1,1,0));
        while(!pq.isEmpty()){
//            1 remove
            PrimsPair rp=pq.poll();
//            2 ignore
            if(visit.contains(rp.vtx)){
                continue;
            }
//            3 mark visited
            visit.add(rp.vtx);
//            4 self work
            System.out.println(rp);
//           5 add unvisited
            for (int nbrs:mp.get(rp.vtx).keySet()){
                if(!visit.contains(nbrs)){
                    int cost=mp.get(rp.vtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs,rp.vtx,cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Prims_Algorithm pq=new Prims_Algorithm(7);
        pq.AddEdge(1, 2, 5);
        pq.AddEdge(1, 4, 2);
        pq.AddEdge(3, 2, 3);
        pq.AddEdge(3, 4, 1);
        pq.AddEdge(5, 4, 6);
        pq.AddEdge(5, 6, 2);
        pq.AddEdge(5, 7, 4);
        pq.AddEdge(7, 6, 8);
        pq.PrimsAlgorithm();
    }
}













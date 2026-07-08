package Graph_CB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal_Graph {
    HashMap<Integer, HashMap<Integer,Integer>> mp;
    public Traversal_Graph(int v){
        mp=new HashMap<>();
        for (int i=1;i<=v;i++){
            mp.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        mp.get(v1).put(v2,cost);
        mp.get(v2).put(v1,cost);
    }
    public void BFT(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visit=new HashSet<>();
        int c=0;
        for (int key:mp.keySet()) {
            if(visit.contains(key)){
                continue;
            }
            c++;//count of component
            q.add(key);
            while (!q.isEmpty()) {
//            1 remove
                int rv = q.poll();
//            2 ignore
                if (visit.contains(rv)) {
                    continue;
                }
//            3 add visited
                visit.add(rv);
//            4 self work
                System.out.println(rv+" ");
//            5 add nbrs unvisited
                for (int nbrs : mp.get(rv).keySet()) {
                    if (!visit.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
    }
}

package Lecture56;

import java.util.*;

public class Cycle_in_Graph {
    private HashMap<Integer, List<Integer>> mp;
    public Cycle_in_Graph(int v){
        mp=new HashMap<>();
        for (int i=0;i<v;i++){
            mp.put(i,new ArrayList<>());
        }
    }
    public void Addedge(int v1,int v2){
        mp.get(v1).add(v2);

    }
    public int [] indegree(){
        int [] in=new int[mp.size()];
        for (int v1:mp.keySet()){
            for (int v2:mp.get(v1)){
                in[v2]++;
            }
        }
        return in;
    }
    public boolean isCyle(){
        Queue<Integer> q=new LinkedList<>();
        int[] in=indegree();
        for (int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int r=q.poll();
            c++;
//            System.out.println(r+" ");
            for (int nbrs:mp.get(r)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        return c!=mp.size();
    }
    public static void main(String[] args) {
        Cycle_in_Graph ts=new Cycle_in_Graph(8);
        ts.Addedge(1, 2);
        ts.Addedge(1, 0);
        ts.Addedge(1, 4);
        ts.Addedge(4, 3);
        ts.Addedge(3, 2);
        ts.Addedge(4, 5);
        ts.Addedge(5, 7);
        ts.Addedge(6, 3);
        ts.Addedge(6, 7);
        System.out.println(ts.isCyle());
    }
}

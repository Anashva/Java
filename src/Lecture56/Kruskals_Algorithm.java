package Lecture56;

import java.util.*;

public class Kruskals_Algorithm {
    private HashMap<Integer, HashMap<Integer,Integer>> mp;
    public Kruskals_Algorithm(int v){
        mp=new HashMap<>();
        for (int i=1;i<=v;i++){
            mp.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        mp.get(v1).put(v2,cost);
        mp.get(v2).put(v1,cost);
    }
    class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        @Override
        public String toString(){
            return e1+" "+e2+" @ "+cost;
        }
    }
    public List<EdgePair> getAllEdge(){
        List<EdgePair> ll=new ArrayList<>();
        for (int e1:mp.keySet()){
            for (int e2:mp.get(e1).keySet()){
                int cpst=mp.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cpst));
            }
        }
        return ll;
    }
    public void Kruskal_Algo(){
        List<EdgePair> ll=getAllEdge();
        Collections.sort(ll,(a,b)->a.cost-b.cost);
        DisJoinSet dsu=new DisJoinSet();
        for (int v:mp.keySet()){
            dsu.create(v);
        }
        int ans=0;
        for (EdgePair e:ll){
            int re1=dsu.find(e.e1);
            int re2=dsu.find(e.e2);
            if(re1==re2){
//                cycle detection case
            }
            else{
                dsu.union(re1,re2);
                ans+=e.cost;
                System.out.println(e);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Kruskals_Algorithm ks=new Kruskals_Algorithm(7);
        ks.AddEdge(1,4,4);
        ks.AddEdge(1,2,3);
        ks.AddEdge(3,2,5);
        ks.AddEdge(3,4,6);
        ks.AddEdge(5,4,8);
        ks.AddEdge(5,6,2);
        ks.AddEdge(5,7,1);
        ks.AddEdge(7,6,9);
        ks.Kruskal_Algo();
    }
}

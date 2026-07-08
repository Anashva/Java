package Lecture52_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public  Graph(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1,int v2){

        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int no=0;
        for (int vrtx: map.keySet()){
            no+=map.get(vrtx).size();
        }
        return no/2;
    }
    public void removeEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removeVertex(int v1){
        for (int nbrs:map.get(v1).keySet()){
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
    public void Display(){
        for (int v:map.keySet()){
            System.out.println(v+" "+map.get(v));
        }
    }
    public boolean HashPath(int src, int desc, HashSet<Integer> visited){
        if (src==desc){
            return true;
        }
        visited.add(src);
        for (int nbrs:map.get(src).keySet()){
            if (!visited.contains(nbrs)) {
                boolean ans = HashPath(nbrs, desc, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        return false;
    }
    public void allPath(int src, int des, HashSet<Integer>visited, String ans){
        if(src==des){
            System.out.println(ans+" "+src);
            return;
        }
        visited.add(src);
        for (int nbrs:map.get(src).keySet()){
            if (!visited.contains(nbrs)) {
                allPath(nbrs, des,visited, ans+" "+src);
            }
        }
        visited.remove(src);
    }

    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.AddEdge(1, 4, 2);
        g.AddEdge(1, 2, 5);
        g.AddEdge(2, 3, 7);
        g.AddEdge(2, 1, 5);
        g.AddEdge(3, 4, -1);
        g.AddEdge(4, 3, -1);
        g.AddEdge(3, 2, 7);
        g.AddEdge(4, 5, 3);
        g.AddEdge(5, 4, 3);
        g.AddEdge(5, 6, 7);
        g.AddEdge(6, 5, 4);
        g.AddEdge(5, 7, 8);
        g.AddEdge(7, 5, 8);
        g.AddEdge(6, 7, 4);
        g.AddEdge(7, 6, 4);
        g.Display();
        HashSet<Integer> st=new HashSet<>();
        System.out.println(g.HashPath(1,6,st));
        g.allPath(1,6,new HashSet<>(),"");
    }
}

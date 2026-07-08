package Lecture53_DFS_BFS;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFT {
    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public  BFT(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void bft(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        int c=0;
       for (int src:map.keySet()){
           if(visited.contains(src)){
               continue;
           }
           q.add(src);
           c++;
           while(!q.isEmpty()){
//            1 remove
               int r=q.poll();
//            2 ignore if already visited
               if(visited.contains(r)){
                   continue;
               }

//            3 marked visited
               visited.add(r);
//            4 self work
               System.out.print(r+" ");
//            5 add unvisited nbrs
               for (int nbrs:map.get(r).keySet()){
                   if(!visited.contains(nbrs)){
                       q.add(nbrs);
                   }
               }
           }
       }
       System.out.println();
       System.out.println(c);
    }

    public static void main(String[] args) {
        BFT g=new BFT(7);
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
        g.bft();
    }
}

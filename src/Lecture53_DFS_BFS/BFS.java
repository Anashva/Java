package Lecture53_DFS_BFS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {

    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public  BFS(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean bfs(int src,int des){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(src);
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
            if(r==des){
                return true;
            }
//            5 add unvisited nbrs
            for (int nbrs:map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BFS bs=new BFS(7);

    }
}

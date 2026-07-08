package Lecture53_DFS_BFS;

import java.util.*;

public class DFS {
    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public  DFS(int v){
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
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        st.push(src);
        while(!st.isEmpty()){
//            1 remove
            int r=st.pop();
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
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
}

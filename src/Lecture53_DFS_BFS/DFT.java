package Lecture53_DFS_BFS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class DFT{
    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public  DFT(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void dft(){
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        for (int src:map.keySet()){
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
                System.out.print(r+" ");
//            5 add unvisited nbrs
                for (int nbrs:map.get(r).keySet()){
                    if(!visited.contains(nbrs)){
                        st.push(nbrs);
                    }
                }
            }
        }
    }
}
//aise graph jiske andar chhoti si bhi odd length ki cycle h to kabhi bhi bipartite nhi hoga,iske alwa alway bipartite
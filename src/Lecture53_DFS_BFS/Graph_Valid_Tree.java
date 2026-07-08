package Lecture53_DFS_BFS;

import java.util.*;

public class Graph_Valid_Tree {
    class Solution{
        public boolean validTree(int n,int[][] edges){
            HashMap<Integer, List<Integer>> mp=new HashMap<>();
            for (int i=0;i<n;i++){
                mp.put(i,new ArrayList<>());
            }
            for (int i=0;i< edges.length;i++) {
                int v1 = edges[i][0];
                int v2 = edges[i][1];
                mp.get(v1).add(v2);
                mp.get(v2).add(v1);

            }
            return bft(mp);
        }
        public boolean bft(HashMap<Integer, List<Integer>> map){
            Queue<Integer> q=new LinkedList<>();
            HashSet<Integer> visited=new HashSet<>();
            int c=0;
            for (int src:map.keySet()){
                if(visited.contains(src)){
                    continue;
                }
                c++;
                q.add(src);
                while(!q.isEmpty()){
//            1 remove
                    int r=q.poll();
//            2 ignore if already visited
                    if(visited.contains(r)){
                        return false;//cycle mil gya
                    }
//            3 marked visited
                    visited.add(r);
//            4 self work
//                    System.out.print(r+" ");
//            5 add unvisited nbrs
                    for (int nbrs:map.get(r)){
                        if(!visited.contains(nbrs)){
                            q.add(nbrs);
                        }
                    }
                }
            }
            return c==1;
        }
    }
}

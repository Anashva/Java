package BootCamp;

import java.util.*;

public class Bipartite {

    public boolean partitite(){
        int[][] edge=new int[5][2];
        HashMap<Integer,Integer> mp=new HashMap<>();
        Queue<pair> pq=new LinkedList<>();
        for(int i=0;i< edge.length;i++){
            if(mp.containsKey(i)){
                continue;
            }
            pq.add(new pair(i,0));
            while(!pq.isEmpty()){
                pair rp=pq.poll();
                int vtx=rp.vtx;
                int dis=rp.dis;
                if(mp.containsKey(vtx)){
                    if(mp.get(vtx)!=dis){
//                        return false;
                    }
                }
                mp.put(vtx,dis);
                for (int nbrs:edge[rp.vtx]){
                    if(!mp.containsKey(nbrs)){
                        pq.add(new pair(nbrs,dis+1));
                    }
                }
            }
        }
        return true;
    }
    static class pair{
        int vtx;
        int dis;
        pair(int vtx,int dis){
            this.vtx=vtx;
            this.dis=dis;
        }
    }
}

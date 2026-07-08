package Lecture55;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Topological_Sort {

//    kisi bhi graph k dependency ko nikl kr deta h,system k andar deadlock h ki nhi ye bhi bta skta h
//    DAG->directed acyclic graph->in degree and out degree
//    cycle-deadlock
//    In degree->ek vertex pr kitni egdes aa rhi h
//   Out-Degree->no of out goind edges of  graph k jane wali vtx usko outing vertex
//    kahn's algo->BFS
//    topological->DFS
//    ts me multiple order ho skta h
//    direct cyclic graph k liye topological sort use hoga
//    graph k me ksi bhi vertex ka in degree agr 0 nhi h to deadlock hoga-cycle detection logic

    private HashMap<Integer, List<Integer>> mp;
    public Topological_Sort(int v){
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
    public void Topological(){
        Queue<Integer> q=new LinkedList<>();
        int[] in=indegree();
        for (int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int r=q.poll();
            System.out.print(r+" ");
            for (int nbrs:mp.get(r)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Topological_Sort ts=new Topological_Sort(8);
        ts.Addedge(1, 2);
        ts.Addedge(1, 0);
        ts.Addedge(1, 4);
        ts.Addedge(4, 3);
        ts.Addedge(3, 2);
        ts.Addedge(4, 5);
        ts.Addedge(5, 7);
        ts.Addedge(6, 3);
        ts.Addedge(6, 7);
        ts.Topological();
    }
}

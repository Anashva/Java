package Graph_CB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import  java.util.Stack;

public class Intro {
    HashMap<Integer,HashMap<Integer,Integer>> mp;
    public Intro(int v){
        mp=new HashMap<>();
        for (int i=1;i<=v;i++){
            mp.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        mp.get(v1).put(v2,cost);
        mp.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1,int v2){
        return mp.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return mp.containsKey(v1);
    }
    public int noofEdge(){
        int sum=0;
        for (int k:mp.keySet()){
            sum+=mp.get(k).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1,int v2){
        mp.get(v1).remove(v2);
        mp.get(v2).remove(v1);
    }
    public void removeVertex(int v){//v=4
        for (int nbrs:mp.get(v).keySet()){//1,3,5
            mp.get(nbrs).remove(v);
        }
        mp.remove(v);

    }
    public void Display(){
        for (int k:mp.keySet()){
            System.out.println(k+" "+mp.get(k));
        }
    }
    public void AddVtx(int v){
        mp.put(v,new HashMap<>());
    }
    public boolean hashpath(int src, int des, HashSet<Integer> visit){
        if(src==des){
            return true;
        }
        visit.add(src);
        for (int nbrs:mp.get(src).keySet()){
            if(!visit.contains(nbrs)){
                boolean ans=hashpath(nbrs,des,visit);
                if(ans){
                    return ans;
                }
            }
        }
        return false;
    }
    public  void PrintAllPath(int src, int des, HashSet<Integer> visit,String ans){
        if(src==des){
            System.out.println(ans+des);
            return ;
        }
        visit.add(src);
        for (int nbrs:mp.get(src).keySet()){
            if(!visit.contains(nbrs)){
                PrintAllPath(nbrs,des,visit,ans+src);
            }
        }
        visit.remove(src);
    }
    public boolean BFS(int src,int des){
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        HashSet<Integer> visit=new HashSet<>();
        while(!q.isEmpty()){
//            1 remove
            int rv=q.poll();
//            2 ignore
            if(visit.contains(rv)){
                continue;
            }
//            3 add visited
            visit.add(rv);
//            4 self work
            if(rv==des){
                return true;
            }
//            5 add nbrs unvisited
            for (int nbrs:mp.get(rv).keySet()){
                if(!visit.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
    public boolean DFS(int src,int des){
        Stack<Integer> st=new Stack<>();
        st.push(src);
        HashSet<Integer> visit=new HashSet<>();
        while(!st.isEmpty()){
//            1 remove
            int rv=st.pop();
//            2 ignore
            if(visit.contains(rv)){
                continue;
            }
//            3 add visited
            visit.add(rv);
//            4 self work
            if(rv==des){
                return true;
            }
//            5 add nbrs unvisited
            for (int nbrs:mp.get(rv).keySet()){
                if(!visit.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Intro g=new Intro(7);
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
        g.removeVertex(4);
        System.out.println("_______________________________");
        g.Display();
        System.out.println(g.hashpath(1,6,new HashSet<>()));
//        System.out.println(PrintAllPath(1,6,new HashSet<>(),""));
    }
}

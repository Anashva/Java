package BootCamp;

import java.util.*;

public class Day1 {
    static HashMap<Integer, List<Integer>> mp;

    public static void main(String[] args) {
        mp=new HashMap<>();
        for(int i=0;i<5;i++){
            mp.put(i,new ArrayList<>());
        }

        int ans=0;
        int[][] arr=new int[5][5];
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(arr[i][j]==1){
                    dfss(arr,i,j);
                    ans++;
                }
            }
        }
    }
    public void dfs() {
        Stack<Integer> st = new Stack();
        HashSet<Integer> s = new HashSet<>();
        while (!st.isEmpty()) {
            int r = st.pop();
            if (s.contains(r)) {
                continue;
            }
            s.add(r);
//            if(r==des){
//                return true;
//            }
            for (int nbrs : mp.get(r)) {
                if (!s.contains(nbrs)) {
                    st.push(nbrs);
                }
            }
        }
    }
    public void bfs(){
        Queue<Integer> st=new LinkedList<>();
        HashSet<Integer> s=new HashSet<>();
        while(!st.isEmpty()){
            int r=st.poll();
            if(s.contains(r)){
                continue;
            }
            s.add(r);
            for(int nbrs:mp.get(r)){
                if(!s.contains(nbrs)){
                    st.add(nbrs);
                }
            }
        }
    }
    public int connect(){
        Queue<Integer> st=new LinkedList<>();
        HashSet<Integer> s=new HashSet<>();
        int c=0;
        for(int k:mp.keySet()){
            if(s.contains(k)){
                continue;
            }
            c++;
            st.add(k);
            while(!st.isEmpty()){
                int r=st.poll();
                if(s.contains(r)){
                    continue;
                }
                s.add(r);
                for(int nbrs:mp.get(r)){
                    if(!s.contains(nbrs)){
                        st.add(nbrs);
                    }
                }
            }
        }
        return c;
    }
    public static  void dfss(int[][] arr,int cr,int cc){
        if(cr>=arr.length || cc>=arr[0].length || cr<0 || cc>0 || arr[cr][cc]==0){
            return ;
        }
        arr[cr][cc]=0;
        dfss(arr,cr+1,cc);
        dfss(arr,cr-1,cc);
        dfss(arr,cr,cc+1);
        dfss(arr,cr,cc-1);
    }

//an image is represented by a 2d array of integer representing the pixel value of the image, given a coordinate (sr,sc) representing the starting pixel(row,col) of the flood fill, and a pixel value newColor. "flood fill" the image. Only pixels having the same original color as (x,y) should be changed.

//    arr[][]={ {1,1,1},
//        {1,1,0},
//        {1,0,1}
//    }
}

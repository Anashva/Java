package SegmentTree;

import java.util.Scanner;

public class Connected_Component {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] edge=new int[n+1][2];
        for(int i=1;i<=m;i++){
            edge[i][0]=sc.nextInt();
            edge[i][1]=sc.nextInt();
        }
        int k=sc.nextInt();
    }

    static class DSU{
        static int[] parent;
        DSU(int n){
            parent=new int[n+1];
            for(int i=1;i<=n;i++){
                parent[i]=i;
            }
        }
        public static int find(int x){
            if(parent[x]==x){
                return x;
            }
            parent[x]=find(parent[x]);
            return parent[x];
        }
        public void union(int x,int y){
            int px=find(x);
            int py=find(y);
            if(px==py){
                return;
            }
            parent[px]=py;


        }
    }
}

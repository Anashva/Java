package Lecture59;

import java.util.*;
public class Maze_III {
    public static void main(String[] args) {
        int[][] grid={{0,0,0,0,0},{1,1,0,0,1},{0,0,0,0,0},{0,1,0,0,1},{0,1,0,0,0}};
        System.out.println(path(grid,new int[]{4,3},new int[]{0,1}));
    }
    public static String path(int[][] grid,int[] start,int[] des){
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            if(a.dis!=b.dis){
                return a.dis-b.dis;
            }
            return a.path.compareTo(b.path);
        });
        pq.add(new pair (start[0],start[1],0,""));
        boolean[][] visit=new boolean[grid.length][grid[0].length];
        int[][] dir={{1,0},{0,-1},{0,1},{-1,0}};
        String[] s={"d","l","r","u"};
        while(!pq.isEmpty()){
            pair r=pq.poll();
            if(visit[r.x][r.y]){
                continue;
            }
            if(r.x==des[0] && r.y==des[1]){
                return r.path;
            }
            visit[r.x][r.y]=true;
            for(int i=0;i<4;i++){
                int x=r.x;
                int y=r.y;
                while(x+dir[i][0]>=0 && x+dir[i][0]<grid.length && y+dir[i][1]>=0 && y+dir[i][1]<grid[0].length && grid[x+dir[i][0]][y+dir[i][1]]==0){
                    x+=dir[i][0];
                    y+=dir[i][1];
                    if (x == des[0] && y == des[1]) {
                        break;
                    }
                }
                if(x!=r.x || y!=r.y){
                    int cost=Math.abs(x-r.x)+Math.abs(y-r.y);
                    pq.add(new pair(x,y,r.dis+cost,r.path+s[i]));
                }
            }
        }
        return "impossible";
    }
    static class pair{
        int x;
        int y;
        int dis;
        String path;
        public pair(int x,int y,int dis,String path){
            this.x=x;
            this.y=y;
            this.dis=dis;
            this.path=path;
        }
    }
}

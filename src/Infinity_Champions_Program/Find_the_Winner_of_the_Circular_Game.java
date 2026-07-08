package Infinity_Champions_Program;

import java.util.*;
public class Find_the_Winner_of_the_Circular_Game {
    public static void main(String[] args) {

    }
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int c=0;
        while(q.size()>1){
            c++;
            int r=q.poll();
            if(c==k){
                // q.poll();
                c=0;
            }
            else{
                q.add(r);
            }
        }
        return q.peek();
    }
}

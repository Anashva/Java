package Infinity_Champions_Program;

import java.util.*;
public class Time_Needed_to_Buy_Tickets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(new int[]{i,tickets[i]});
        }
        int c=0;
        int ans=0;
        while(!q.isEmpty()){
            int[] r=q.poll();
            ans++;
            r[1]--;
            if(r[1]==0){
                if(r[0]==k){
                    return ans;
                }
            }
            else{
                q.add(r);
            }
        }
        return ans;
    }
}

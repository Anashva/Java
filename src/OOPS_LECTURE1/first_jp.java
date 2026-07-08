package OOPS_LECTURE1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class first_jp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int ans=0;
        while(m-->0){
            int k=pq.poll();
            if(k-1>0){
                ans+=k;
                pq.add(k-1);
            }
        }
        System.out.println(ans);
    }
}

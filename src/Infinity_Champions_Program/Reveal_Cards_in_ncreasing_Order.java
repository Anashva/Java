package Infinity_Champions_Program;

import java.util.*;
public class Reveal_Cards_in_ncreasing_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=reveal(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
    public static int[] reveal(int[] arr){
        Arrays.sort(arr);
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            if(q.isEmpty()){
                q.add(arr[i]);
            }
            else{
                q.addFirst(q.removeLast());
                q.addFirst(arr[i]);
            }
        }
        int idx=0;
        int[] ans=new int[arr.length];
        for(int i:q){
            ans[idx++]=i;
        }
        return ans;
    }
}

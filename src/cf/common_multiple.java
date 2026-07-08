package cf;

import java.util.HashMap;
import java.util.Scanner;

public class common_multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            }
            int count=0;
            for (Integer k:mp.keySet()){
                if(mp.get(k)>=1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

package cf;

import java.util.HashMap;
import java.util.Scanner;

public class spy_detected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            index(arr);
        }
    }
    public static void index(int[] arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i])==1){
                System.out.println(i+1);
                return;
            }
        }
    }
}

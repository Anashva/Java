package Lecture29_OOPS;

import java.util.ArrayList;

public class grid {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                {1,5,3,5},
                {1,9,1,3},
                {2,1,4,5}};
        ArrayList<Integer> ll=new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                check(arr,i,j,0,"",ll);
            }
        }
        int ans=0;
//        System.out.print(ll);
        for(int i=0;i<ll.size();i++){
            Math.max(ans,ll.get(i));
        }
        System.out.print(ans);
    }
    public static void check(int[][] arr,int cr,int cc,int l,String ans,ArrayList<Integer> ll){
        if(l==4){
            int n=Integer.parseInt(ans);
//            System.out.println(ans);
            ll.add(n);
            return;
        }
        if(cr<0 || cc<0 || cc>=arr[0].length || cr>=arr.length || arr[cr][cc]==0){
            return;
        }

//        visited[cr][cc]=false;
        int a=arr[cr][cc];
        arr[cr][cc]=0;
        check(arr,cr-1,cc,l+1,ans+a,ll);
        check(arr,cr,cc-1,l+1,ans+a,ll);
        check(arr,cr+1,cc,l+1,ans+a,ll);
        check(arr,cr,cc+1,l+1,ans+a,ll);
        arr[cr][cc]=a;

    }


}

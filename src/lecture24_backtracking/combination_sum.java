package lecture24_backtracking;

import java.util.ArrayList;
import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=9;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        combination(arr,target,0,ll,ans);
        System.out.println(ans);
    }
    public static void combination(int[] coin,int amount,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<coin.length;i++){//ll is made in heap memory and cannot be undo
            if(amount>=coin[i]){
                ll.add(coin[i]);
                combination(coin,amount-coin[i],i,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}

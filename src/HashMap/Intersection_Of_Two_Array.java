package HashMap;

import Lecture41.HashMap;
import java.util.ArrayList;
import java.util.List;


public class Intersection_Of_Two_Array {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,2,5};
        int[] arr2={2,4,3,6,8,2};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<arr1.length;i++){
            if (mp.containsKey(arr1[i])){
//                int v=mp.get(arr1[i]);
                mp.put(arr1[i],mp.get(arr1[i]+1));
            }
            else {
                mp.put(arr1[i],1);
            }
        }
        List<Integer> ll=new ArrayList<>();
        for (int i=0;i<arr2.length;i++){
            if (mp.containsKey(arr2[i]) && mp.get(arr2[i])>0){
                ll.add(arr2[i]);
                mp.put(arr2[i],mp.get(arr2[i])-1);
            }
        }
        int[] ans=new int [ll.size()];
        for (int i=0;i<ans.length;i++){
            ans[i]=ll.get(i);
        }
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

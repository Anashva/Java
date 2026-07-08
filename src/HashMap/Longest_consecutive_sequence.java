package HashMap;

//import Lecture41.HashMap;
import java.util.HashMap;
public class Longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(cs(arr));
    }
    public static int cs(int[] arr){
        HashMap<Integer,Boolean> mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i]-1)){
                mp.put(arr[i],false);
            }
            else {
                mp.put(arr[i],true);
            }
            if(mp.containsKey(arr[i]+1)){
                mp.put(arr[i]+1,false);
            }
        }
        int ans=0;
        for (int k: mp.keySet()){
            if(mp.get(k)){
                int c=0;
                while(mp.containsKey(k)){
                    c++;
                    k++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}

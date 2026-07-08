package leetcode_practise;

import java.util.ArrayList;
import java.util.List;

public class permutation_sequence {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ll.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int num : ll) {
            sb.append(num).append("");
        }
        String result = sb.toString().trim();
        List<String> arr=new ArrayList<>();
        permute(result,"",arr);
        System.out.println(arr.get(2));

    }
    public static void permute(String n,String ans,List<String> arr) {
        if (n.length() == 0) {
//            System.out.println(ans);
            arr.add(ans);
            return;
        }
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            String s1 = n.substring(0, i);
            String s2 = n.substring(i + 1);
            permute(s1 + s2, ans + ch,arr);
        }
    }
}

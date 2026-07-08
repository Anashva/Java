package Infinity_Champions_Program;

import java.util.*;
public class Find_Mirror_Score_of_a_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        long ans=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            int mirror=25-ch;
            if(mp.containsKey(mirror) && mp.get(mirror).size()>0){
                ans+=i-mp.get(mirror).get(mp.get(mirror).size()-1);
                mp.get(mirror).remove(mp.get(mirror).size()-1);
            }
            else{
                if(!mp.containsKey(ch)){
                    mp.put(ch,new ArrayList<>());
                }
                mp.get(ch).add(i);
            }
        }
        System.out.print(ans);
    }
}

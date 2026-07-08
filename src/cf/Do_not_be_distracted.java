package cf;

import java.util.HashSet;
import java.util.Scanner;

public class Do_not_be_distracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(possible(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean possible(String s){
        if(s.length()<=2){
            return true;
        }
        HashSet<Character> mp=new HashSet<>();
        char ch=s.charAt(0);
        mp.add(ch);
        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1!=ch){
                if(mp.contains(ch1)){
                    return false;
                }
                mp.add(ch1);
                ch=ch1;
            }
        }
        return true;
    }
}

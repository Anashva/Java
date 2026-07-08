package cf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I_wanna_be_the_guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<p;i++){
            st.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for (int i=0;i<q;i++){
            st.add(sc.nextInt());
        }
        if(st.size()==n){
            System.out.print("I become the guy.");
        }
        else{
            System.out.print("Oh, my keyboard!");
        }
    }
}

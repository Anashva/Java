package cf;

import java.util.HashSet;
import java.util.Scanner;

public class Balloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            String s=sc.next();
            HashSet<Character> mp=new HashSet<>();
            int c=0;
            for(int i=0;i<n;i++){
                if(!mp.contains(s.charAt(i))){
                    c=c+2;
                    mp.add(s.charAt(i));
                }
                else {
                    c=c+1;
                }
            }
            System.out.println(c);
        }
    }
}

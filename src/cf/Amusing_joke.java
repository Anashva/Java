package cf;

import java.util.Scanner;

public class Amusing_joke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String gues=sc.next();
        String host=sc.next();
        String pile=sc.next();
        System.out.println(chec(gues,host,pile));

    }
    public static String chec(String gues,String host,String pile){
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<gues.length();i++){
            freq1[gues.charAt(i)-'A']++;
        }
        for(int i=0;i<host.length();i++){
            freq1[host.charAt(i)-'A']++;
        }
        for(int i=0;i<pile.length();i++){
            freq2[pile.charAt(i)-'A']++;
        }
        for (int i=0;i<26;i++){
            if(freq2[i]!=freq1[i]){
                return "NO";
            }
        }
        return "YES";
    }
}

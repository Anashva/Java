package cf;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String l = s.toLowerCase();
        int[] freq=new int[26];
        for(int i=0;i<l.length();i++){
            freq[l.charAt(i)-'a']++;
        }
        System.out.print(freqq(freq));
    }
    public static String freqq(int[] freq){
        for(int i=0;i<26;i++){
            if(freq[i]<1){
                return "NO";
            }
        }
        return "YES";
    }
}

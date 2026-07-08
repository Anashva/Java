package codeforce_practice;

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                freq[i]=1;
            }
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            sum+=freq[i];
        }
        if(sum%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }

    }
}

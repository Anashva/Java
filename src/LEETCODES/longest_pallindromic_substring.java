package LEETCODES;

import java.util.Scanner;

public class longest_pallindromic_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        int c=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ch=s.substring(i,j+1);
                if(pallindrome(ch)){
                    if(j-i+1>ans){
                        ans=j-i+1;
                        c=i;
                        str=s.substring(c,ans);
                    }
                }
            }
        }
        System.out.print(str);

    }
    public static boolean pallindrome(String ch){
        int i=0;
        int j=ch.length()-1;
        while(i<j){
            if(ch.charAt(i)!=ch.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

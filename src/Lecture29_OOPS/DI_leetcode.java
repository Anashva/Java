package Lecture29_OOPS;

import java.util.Stack;
public class DI_leetcode {
    public static void main(String[] args) {
        String s="IIIDIDDD";
        System.out.println(construct(s));
    }
    public static String construct(String s){
        int [] ans=new int[s.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str="";
        for(int num:ans){
            str+=num;
        }
        return str;
    }
}

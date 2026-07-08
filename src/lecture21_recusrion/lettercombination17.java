package lecture21_recusrion;

import java.util.ArrayList;
import java.util.List;

public class lettercombination17 {
    public static void main(String[] args) {
        String ques="29";
        List<String>ll= new ArrayList<>();
        if(ques.length()==0){
            System.out.println(ll);
        }
        phonenumber(ques,"",ll);
        System.out.println(ll);
    }

    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void phonenumber(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String getstring=key[ques.charAt(0)-'0'];
        for(int i=0;i<getstring.length();i++){
            phonenumber(ques.substring(1),ans+getstring.charAt(i),ll);//O(4^n)
        }
    }
}

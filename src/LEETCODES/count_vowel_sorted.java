package LEETCODES;

public class count_vowel_sorted {
    public static void main(String[] args) {
        int n=2;
        String s="aeiou";
        System.out.println(vowel(n,"",s));

    }
    public static int vowel(int n,String ans,String ques){
        if(ans.length()==n){
            System.out.println(ans);
            return 1;
        }
        if(ans.length()>n){
            return 0;
        }
        int x=0;
        for(int i=0;i<ques.length();i++){
            String s=ques.substring(i);
            x+=vowel(n,ans+ques.charAt(i),s);
        }
        return x;
    }
}

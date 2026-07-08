package lecture16_String_Important;

import java.util.Scanner;
public class substring_print {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(good(s));

    }
    public static int good(String s){
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                c++;
            }
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
        ans=Math.max(ans,c);
        return ans;
    }
    public static boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}


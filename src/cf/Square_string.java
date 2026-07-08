package cf;

import java.util.Scanner;

public class Square_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(square(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean square(String s){
        if(s.length()%2!=0){
            return false;
        }
        int n=s.length()/2;
        int i=0;
        int j=n;
        while(i<n && j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}

package cf;

import java.util.Scanner;
public class Short_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            StringBuilder sb=new StringBuilder();

            sb.append(s.charAt(0));
            for (int i=1;i<s.length();i=i+2){
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }
    }
}

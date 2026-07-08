package CODE_FORCES;

import java.util.Scanner;

public class skibu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(s.endsWith("us")){
                String k=s.substring(0,s.length()-2);
                System.out.println(k+"i");
            }
            else{
                System.out.println(s);
            }
        }
    }
}

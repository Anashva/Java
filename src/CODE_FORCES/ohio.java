package CODE_FORCES;

import java.util.Scanner;

public class ohio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int c=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    c++;
                    break;
                }
            }
            if(c==1){
                System.out.println(1);
            }
            else{
                System.out.println(s.length());
            }

        }
    }
}

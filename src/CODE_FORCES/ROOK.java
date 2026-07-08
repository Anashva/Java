package CODE_FORCES;

import java.util.Scanner;

public class ROOK {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            String st=sc.next();
            for(int i=1;i<=8;i++){
                for(char ch='a';ch<='h';ch++){
                    String st1=Integer.toString(i);
                    if(st.charAt(0)==ch && st1.charAt(0)==st.charAt(1)){

                        continue;

                    }
                    else if(st.charAt(0)==ch || st1.charAt(0)==st.charAt(1)){
                        System.out.println(ch+st1);
                    }
                }
            }
            t--;
        }
    }
}

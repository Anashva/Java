package CODE_FORCES;

import java.util.Scanner;

public class Vlad_and_best_of_five {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            String s=sc.next();
            int c=0;
//            char[] chararray=new char[5];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'){
                    c++;
                }
            }
            if(c>=3){
                System.out.println('A');
            }
            else{
                System.out.println('B');
            }


            t--;
        }
    }
}

package cf;

import java.util.Scanner;
public class Erasing_zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(zero(s));
        }
    }
    public static int zero(String s){
        if(s.length()==1){
            return 0;
        }
        int first=s.indexOf('1');
        int last=s.lastIndexOf('1');
        int zero=0;
        for(int i=first+1;i<last;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }

        }
        return zero;
    }
}

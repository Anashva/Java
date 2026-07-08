package CODE_FORCES;

import java.util.Scanner;

public class Colourblindness {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            String cl1=sc.next();
            String cl2=sc.next();
            int r=0;
            for(int j=0;j<n;j++){
                char ch1=cl1.charAt(j);
                char ch2=cl2.charAt(j);
                if((ch1=='R' && ch2!='R' ) || (ch1!='R' && ch2=='R')){
                    r=0;
                    break;
                }
                else{
                    r++;
                }
            }
            if(r==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}

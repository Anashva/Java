package CODE_FORCES;

import java.util.Scanner;

public class Upscalling {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    if((i+j)%2==0){
                        s+="##";
                    }
                    else{
                        s+="..";
                    }
                }
                System.out.println(s);
                System.out.println(s);

            }
            t--;
        }
    }
}

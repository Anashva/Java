package CODE_FORCES;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            if(x==2){
                System.out.println(-1);
            }
            else{
                int a=x;
                while(a>=2){
                    int b=a--;
                    if(b<a){
                        int c=a ^ b;
                        if(a+b<c ||a+c<b || c+b<a){
                            System.out.println(b);
//                            break;
                        }
                    }

                }
            }
        }
    }
}

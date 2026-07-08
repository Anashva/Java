package Lecture62;

import java.util.*;
public class Ehab_the_Xorcist {
    public static void main(String[] args) {
//        p+q=p^q +2(p & q)
//        u+x=u^x +2(u & x)
//          u+x>=u^x
        Scanner sc=new Scanner(System.in);
        long u=sc.nextLong();
        long v=sc.nextLong();
        if(u==v){
            if(u==0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
                System.out.print(u);
            }
        }
        else if(u>v || u%2!=v%2){
            System.out.println(-1);
        }
        else{
            long x=(v-u)/2;
            if((u & x)==0){
                System.out.println(2);
                System.out.println(u+x+" "+x);
            }
            else{
                System.out.println(3);
                System.out.println(u+" "+x+" "+x);
            }
        }


    }
}

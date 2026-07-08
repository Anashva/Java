package CODE_FORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class fibo {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        ArrayList<Integer>ll=new ArrayList<>();
        while (t-->0){
            int a1= sc.nextInt();
            int a2= sc.nextInt();
            int a4= sc.nextInt();
            int a5= sc.nextInt();
            int c=0;
            for(int i=-200;i<=200;i++){
                int count=0;
                if(i==a2+a1){
                    count++;
                }
                if(a4==a2+i){
                    count++;
                }
                if(a5==i+a4){
                    count++;
                }
                c=Math.max(count,c);
            }
            ll.add(c);
        }
        for (int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
    }
}

package cf;

import java.util.Scanner;

public class YES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String y=sc.next();
            if(y.contains("YES") || y.contains("yES") || y.contains("YeS") || y.contains("YEs") ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

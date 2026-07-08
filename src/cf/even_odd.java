package cf;

import java.util.ArrayList;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int oddc=(n+1)/2;
        if(k<=oddc){
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-oddc));
        }
    }
}

package LEETCODES;

import java.util.Scanner;

public class Sum_Of_Square_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        boolean k=false;
        for(int i=1;i<c;i++){
            int l=1;
            int h=c;

            while(l<h){
                int mid=l+(h-l)/2;
                int m=i*i+mid*mid;
                if(m==c){
                    k=true;
                    break;
                }
                else if(m<c){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        System.out.println(k);
    }
}

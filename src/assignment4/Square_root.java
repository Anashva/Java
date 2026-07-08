package assignment4;

import java.util.Scanner;

public class Square_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(square(n));
    }
    public static int square(int n){
        int l=1;
        int h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid*mid==n){
                return (int)mid;
            }
            else if(mid*mid<n){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int)Math.floor(Math.sqrt(n));
    }
}

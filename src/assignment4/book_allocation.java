package assignment4;

import java.util.Scanner;

public class book_allocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int nos=sc.nextInt();
            int[] page = new int[n];
            for (int i = 0; i < n; i++) {
                page[i] = sc.nextInt();
            }
            System.out.println(minimum_page(page,nos));
        }

    }
    public static int minimum_page(int[] page,int nos){
        int l=0;
        int h=0;
        int ans=0;
        for (int i = 0; i < page.length; i++) {
            h+=page[i];
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isitpossible(page,nos,mid)==true){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] page,int nos, int mid){
        int student=1;
        int pageread=0;
        int i=0;
        while(i<page.length){
            if(page[i]+pageread<=mid){
                pageread+=page[i];
                i++;
            }
            else{
                student++;
                pageread=0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;}

}








package test_practice;

import java.util.Scanner;

public class allocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int student=sc.nextInt();
        int[] n_books=new int[n];
        int h=0;
        for (int i=0;i<n;i++){
            n_books[i]=sc.nextInt();
            h+=n_books[i];
        }
        int l=0;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isitpossible(n_books,student,mid)){
                ans=mid;
                h=mid-1;
            }

            else{
                l=mid+1;
            }
        }
        System.out.print(ans);
    }
    public static boolean isitpossible(int[] n_students,int student,int mid){
        int n_s=1;
        int pages=0;
        int i=0;
        while(i<n_students.length){
            if(pages+n_students[i]<=mid){
                pages+=n_students[i];
                i++;
            }
            else{
                n_s++;
                pages=0;
            }
            if(n_s>student){
                return false;
            }
        }
        return true;
    }
}

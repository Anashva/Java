package test_practice;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class painters_partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no_painter= sc.nextInt();
        int n= sc.nextInt();
        int [] boards=new int[n];
        int h=0;
        int l=0;
        int ans=0;
        for (int i=0;i<n;i++){
            boards[i]=sc.nextInt();
            h+=boards[i];
            l= Math.max(l,boards[i]);
        }
        Arrays.sort(boards);
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isitpossible(boards,no_painter,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.print(ans);
    }
    public static boolean isitpossible(int[] boards,int no_painter,int mid){
        int c=1;
        int paint=0;
        for(int i=0;i<boards.length;i++){
            if(paint+boards[i]>mid){
                paint=boards[i];
                c++;
            }
            else{
                paint+=boards[i];
            }
            if(c>no_painter)
            {
                return false;
            }
        }
        return true;
    }
}

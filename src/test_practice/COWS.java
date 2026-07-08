package test_practice;

import java.util.Arrays;
import java.util.Scanner;

public class COWS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=sc.nextInt();
        int[] stall=new int[n];
        for (int i=0;i<n;i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
        int l=0;
        int h=stall[n-1]-stall[0];
        int ans=0;
        while(l<=h){
            int mimimumdistance=l+(h-l)/2;
            if(isitpossible(stall,c,mimimumdistance)){
                ans=mimimumdistance;
                l=mimimumdistance+1;

            }
            else{
                h=mimimumdistance-1;
            }
        }
        System.out.print(ans);

    }
    public static boolean isitpossible(int[] stall,int cows,int minimumd){
        int c=1;
        int pos=stall[0];
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=minimumd){
                pos=stall[i];
                c++;
            }
            if(c==cows){
                return true;
            }
        }
        return false;
    }
}

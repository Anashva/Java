package test_practice;

import java.util.Scanner;

public class paratha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int parantha= sc.nextInt();
        int l=sc.nextInt();
        int[] stall=new int[l];
        int ans=0;
        int L=0;
        for (int i=0;i<stall.length;i++){
            stall[i]=sc.nextInt();
        }
        int h=(stall[l-1]*(parantha*(parantha+1)))/2;
        while(L<=h){
            int mid=L+(h-L)/2;
            if(isitpossible(stall,parantha,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                L=mid+1;
            }
        }
        System.out.print(ans);
    }
    public static boolean isitpossible(int[] stall,int parantha,int mid){
        int p=1;
        int i=0;
        int time=0;
        int totalparantha=0;
        while(i<stall.length){
            if(time+p*stall[i]<=mid){
                totalparantha++;
                time+=p*stall[i];
                p++;
            }
            else{
                time=0;
                p=1;
                i++;
            }
            if(totalparantha>parantha){
                return true;
            }
        }
        return false;
    }
}

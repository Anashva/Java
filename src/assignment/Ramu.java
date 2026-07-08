package assignment;

import java.util.Scanner;

public class Ramu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] rikshaw=new int[n];
            int[] cab=new int[m];
            for(int i=0;i<n;i++){
                rikshaw[i]= sc.nextInt();
            }
            for(int i=0;i<m;i++){
                cab[i]= sc.nextInt();
            }
            int min_of_rikshaw=0;
            for(int i=0;i<n;i++){
                min_of_rikshaw=min_of_rikshaw+Math.min(rikshaw[i]*c1,c2);
            }
            int total_cost_of_rickshaws=Math.min(min_of_rikshaw,c3);
            int min_of_cab=0;
            for(int i=0;i<m;i++){
                min_of_cab=min_of_cab+Math.min(cab[i]*c1,c2);
            }
            int total_cost_of_cab=Math.min(min_of_cab,c3);
            int total_final_cost=Math.min(total_cost_of_cab+total_cost_of_rickshaws,c4);
            System.out.println(total_final_cost);
            t--;
        }
    }
}

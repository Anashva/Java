package OOPS_LECTURE1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//maximum number of activity can be completed on the basis of end time
public class Buzy_Man {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Pair[] arr=new Pair[n];
            for (int i=0;i<n;i++){
                int si=sc.nextInt();
                int et=sc.nextInt();
                arr[i]=new Pair(si,et);
            }
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.et-o2.et;//increasing time me end time sort ho jaega
                }
            });
            int ac=1;
            int end=arr[0].et;
            for (int i=1;i<arr.length;i++){
                if(end<=arr[i].si){
                    ac++;
                    end=arr[i].et;
                }
            }
            System.out.println(ac);
        }
    }
    static class Pair{
        int si;
        int et;
        public Pair(int si,int et){
            this.si=si;
            this.et=et;
        }
    }
}

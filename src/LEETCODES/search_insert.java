package LEETCODES;
import java.util.Scanner;
public class search_insert {
    public static int insert(int[]arr,int t){
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                k=i;
            }
            if (arr[i]>t) {
                k=i;
            }
            if(arr[i]<t){
                k=i-1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int s=insert(arr,t);
        System.out.println(s);
    }
}

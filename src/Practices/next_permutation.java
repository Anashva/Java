package Practices;
import java.util.*;

public class next_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            next_permuation(arr);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
    public static void next_permuation(int[] arr){
        int n=arr.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse_range(arr,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        int t=arr[p];
        arr[p]=arr[q];
        arr[q]=t;
        reverse_range(arr,p+1,arr.length-1);
    }
    public static void reverse_range(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}





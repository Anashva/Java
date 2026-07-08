package lecture8;
import java.util.*;
public class array {
    public static void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
//        starting n-k reverse kro
        reverse(arr,0,n-k-1);
//        last ke k reverse kro
        reverse(arr,n-k,n-1);
//        all elemnets reverse kro
        reverse(arr,0,n-1);

    }

    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=3;
        rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

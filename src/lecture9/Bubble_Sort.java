package lecture9;
import java.util.*;
public class Bubble_Sort {
    public static int[] bubblesort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
//        BUBBLE SORT
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int[]anr=bubblesort(arr);
        for(int i=0;i<n;i++) {
            System.out.println(anr[i]);
        }
    }
}

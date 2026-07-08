package lecture9;

import java.util.Scanner;
public class Selection {
    public static void selection(int[]arr){
        for (int i = 0; i < arr.length; i++){
            int idx = min_form_ith_index(arr,i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static int min_form_ith_index(int[] arr, int i) {
        int mini = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[mini]>arr[j]) {
                mini = j;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}

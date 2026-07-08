package lecture9;
import java.util.Scanner;
public class Insertion {
    public static void insertlastelement(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0){
            if(arr[j]>item){
                arr[j+1]=arr[j];
                arr[j]=item;
            }
            j--;
        }
    }

    public static void insertiosort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            insertlastelement(arr,i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        insertiosort(arr);
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}

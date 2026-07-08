package lecture9;
import java.util.*;
public class mineleindx {
    public static int eleindex(int[] arr,int i){
        int n=arr.length;
        int min=i;
        for(int j=i+1;j<n;j++) {
            if(arr[j]>min){
                min=j;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(eleindex(arr,2));
    }
}

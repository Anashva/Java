package LECTURE10.STRING;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        for(int i=n-1;i>=0;i--){
//            System.out.println(arr[i]);
//        }
//FOR EACH LOOP:ARRAY ELEMENTS CAN ALSO BE TRAVERSED AS FOLLOW:
        for (int i:arr ){
            System.out.println(i);
        }


    }
}

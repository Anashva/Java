package cf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Beautiful_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=n+i;
            if(isitpossible(k)){
                System.out.print(k);
                return;
            }
        }
    }
    public static boolean isitpossible(int k){
        String s=Integer.toString(k);
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<s.length()-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        return true;
    }

}

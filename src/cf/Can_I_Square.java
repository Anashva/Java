package cf;

import java.util.*;
public class Can_I_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if(possible(sum)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean possible(long sum){
        long sqr=(int)Math.sqrt(sum);
        if(sqr*sqr==sum){
            return true;
        }
        return false;
    }
}

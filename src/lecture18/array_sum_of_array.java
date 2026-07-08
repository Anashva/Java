package lecture18;
import java.util.*;
public class array_sum_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int i=n-1;
        int j=m-1;
        int carry=0;
        ArrayList<Integer> sum=new ArrayList<>();
        while(i>=0 && j>=0){
            int s=arr1[i]+arr2[j]+carry;
            sum.add(s%10);
            carry=s/10;
            i--;
            j--;
        }
        while(i>=0){
            int s=arr1[i]+carry;
            sum.add(s%10);
            carry=s/10;
            i--;
        }
        while(j>=0){
            int s=arr2[j]+carry;
            sum.add(s%10);
            carry=s/10;
            j--;
        }
        if(carry>0){
            sum.add(carry);
        }

        Collections.reverse(sum);
        for(int k=0;k<sum.size();k++){
            System.out.print(sum.get(k)+", ");
        }
        System.out.print("END");
    }
}

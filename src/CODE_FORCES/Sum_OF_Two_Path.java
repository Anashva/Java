package CODE_FORCES;
import java.util.*;
public class Sum_OF_Two_Path {
    public static void main(strin[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int [] num = new int[m1];
            int [] num1 = new int[m2];
            for(int i=0 ; i<m1 ; i++){
                num[i] = sc.nextInt();
            }
            for(int i=0 ; i<m2 ; i++){
                num1[i] = sc.nextInt();
            }
            int sum = sum_of_two_path(num , num1);
            System.out.println(sum);
            t--;
        }
    }
    public static int sum_of_two_path(int [] arr,int[] arr1){
        int n1=arr.length;
        int n2=arr1.length;
        int sum=0;
        int id1=0;
        int id2=0;
        int current_id1=0;
        int current_id2=0;
        int i=0;
        int j=0;
        while(id1<n1 || id2<n2){
            int sum1=0;
            int sum2=0;
            for(i=id1;i<n1;i++){
                for( j=id2;j<n2;j++){
                    if(arr[i]==arr1[j]){
                        current_id1=i;
                        current_id2=j;
                        break;
                    }
                }
                if(j<n2 && arr[i]==arr1[j]){
                    break;
                }
            }
            if(i==n1 && j==n2){
                current_id1=n1-1;
                current_id2=n2-1;
            }
            for(i=id1;i<=current_id1;i++){
                sum1+=arr[i];
            }
            for(j=id1;j<=current_id2;j++){
                sum2+=arr1[j];
            }
            if(sum1>sum2){
                sum+=sum1;
            }
            else{
                sum+=sum2;
            }
            id1=current_id1;
            id2=current_id2;
            if(id1==n1-1 || id2==n2-1){
                if(n1>n2){
                    current_id1=n1-1;
                }
                else{
                    current_id2=n2-1;
                }
            }
            id1++;
            id2++;
        }
        return sum;
    }
}


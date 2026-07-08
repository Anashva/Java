package cf;

import java.util.Scanner;

public class Maximum_multiple_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int max=2;
            int ele=2;
            for(int i=2;i<=n;i++){
                int sum=0;
                for(int j=i;j<=n;j++){
                    if(j%i==0){
                        sum+=j;
                        if(max<=sum){
                            max=sum;
                            ele=i;
                        }
                    }
                }
            }
            System.out.print(ele);
        }

    }
}

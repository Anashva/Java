package Lecture70;

import java.util.*;

public class Two_Arrays_and_Sum_of_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] a=new long [n];
        Integer[] b=new Integer[n];
        for (int i=0;i<n;i++){
            long x=sc.nextLong();
            a[i]=(long)x*(i+1)*(n-i);//couting number of subaaray each element occur
        }
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        long mod=998244353;
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        long ans=0;
        for (int i=0;i<n;i++){
            ans=(ans+(a[i]%mod)*b[i])%mod;
        }
        System.out.println(ans);
    }
}

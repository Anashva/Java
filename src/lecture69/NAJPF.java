package lecture69;

import java.util.ArrayList;
import java.util.*;

public class NAJPF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String p=sc.next();
            Rabin_karp(s,p);
        }

    }
    public static void Rabin_karp(String s,String p){
        if(p.length()>s.length()){
            return;
        }

//        pattern
        long hv=0;
        long pow=1;
        long pr=31;
        long mod=1000000007;
        for(int i=0;i<p.length();i++){
            hv=(hv+((p.charAt(i)-'a'+1)*pow)%mod)%mod;
            pow=(pow*pr)%mod;
        }
//        text
        long [] dp=new long[s.length()];
        long [] pa=new long[s.length()];
        pa[0]=1;
        pow=31;
        dp[0]=s.charAt(0)-'a'+1;
        for (int i=1;i<s.length();i++) {
            dp[i] = (dp[i - 1] + ((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
            pa[i] = pow;
            pow = (pow * 31) % mod;
        }
//        ans calculation
        List<Integer> ll=new ArrayList<>();
        int n=p.length();
        if(dp[n-1]==hv){
            ll.add(1);
        }
        for (int i=n;i<s.length();i++){
            int k=i-n;
            long curr=(dp[i]-dp[k]+mod)%mod;
            if(curr==(hv*pa[k+1])%mod){
                ll.add(k+2);
            }
        }
        if(ll.size()==0){
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println(ll.size());
            for (int x : ll) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

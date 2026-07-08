import java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println(2^12);
        int number = 9;
        int base = 3; // Binary base
        String binaryString = Integer.toString(number, base);
        System.out.println("Binary representation: " + binaryString);

//        int num1=1;
//        int num2=12;
//        int ans=Integer.MAX_VALUE;
//        int sum=0;
//        int mul=1;
//        int c=0;
//        int n2=num2;
//        while(num2>0) {
//            int rem=num2%2;
//            if(rem==1){
//                c++;
//            }
//            sum=sum+rem*mul;
//            num2=num2/2;
//            mul=mul*10;
//        }
//        for(int i=num1;i<n2;i++){
//            int k=0;
//            int p=1;
//            int d=0;
//            int n1=i;
//            while(i>0){
//                int r=i%2;
//                if(r==1){
//                    d++;
//                }
////                System.out.print(d+" "+c);
//                k=k+r*p;
//                i=i/2;
//                p=p*10;
//            }
//            int n=n1^num1;
//            if(n<ans && c==d){
//                n=ans;
//            }
//        }
//        System.out.println(ans);
//        int n=3;
//        int sum=0;
//        int mul=1;
//        int c=0;
//        while(n>0) {
//            int rem=n%2;
//            if(rem==1){
//                c++;
//            }
//            sum=sum+rem*mul;
//            n=n/2;
//            mul=mul*10;
//        }
//        System.out.println(sum);
//        System.out.println(c);
//        String haystack="sadbutsad";
//        String k="sado";
//        int x=haystack.indexOf(k);
//        System.out.println(x);
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int r=0;
//        if(x<0){
//            int N=Math.abs(x);
//            while(N>0){
//                int k=N%10;
//                if(r>(Integer.MAX_VALUE-k)/10){
//                    return 0;
//                }
//                r=r*10+k;
//                N=N/10;
//            }
//            return -r;
//
//        }
//        else{
//            while(x>0){
//                int k=x%10;
//                if(r>(Integer.MAX_VALUE-k)/10){
//                    return 0;
//                }
//                r=r*10+k;
//                x=x/10;
//            }
//            return r;
//
//        }



//        int[] arr=new int[n];
//        int[] arr1=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            arr1[i]=sc.nextInt();
//        }
//        String s1="";
//        String s2="";
//        for(int i=0;i<n;i++){
//            s1+=arr[i];
//        }
//        for(int i=0;i<n;i++){
//            s2=s2+arr1[i];
//        }
//        int k=Integer.parseInt(s1);
//        int m=Integer.parseInt(s2);
//        int l=k+m;
//        String st=Integer.toString(l);
//        int[] ab=new int[n];
//        for(int i=0;i<st.length();i++){
//            char c=st.charAt(i);
//            ab[i]=(int)c;
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(ab[i]+" ");
//        }
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<10;i++){
//            int k=n*i;
//            System.out.println(n+"*"+i+"="+k);
//        }

    }
}
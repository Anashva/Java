package Infinity_Champions_Program;

import java.util.*;
public class Sum_of_Total_Strength_of_Wizards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<n;i++){
            int sum=0;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min=Math.min(arr[j],min);
                sum+=arr[j];
                total=(total+sum*min);
            }
        }
        System.out.println(total);
    }
    public static int strength(int[] arr){
        int n=arr.length;
        long[] pref=new long[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=arr[i]+pref[i-1];
        }
        long[] pref2=new long[n];
        pref2[0]=pref[0];
        for(int i=1;i<n;i++){
            pref2[i]=pref[i]+pref2[i-1];
        }

        int[] left=new int[n];
        int[] right=new int[n];

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            left[i]=st.isEmpty() ? i+1 :i-st.peek();
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            right[i]=st.isEmpty() ? n-i :st.peek()-i;
            st.push(i);
        }
        long total=0;
        for(int i=0;i<n;i++){
            int l=i-left[i]+1;
            int r=i+right[i]-1;


        }
        return (int)total;
    }
}

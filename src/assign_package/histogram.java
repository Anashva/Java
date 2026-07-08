package assign_package;

import java.util.Scanner;
import java.util.Stack;

public class histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                ans=Math.max(ans,h*r);
            }
            else{
                int l=st.peek();
                ans=Math.max(ans,h*(r-l-1));
            }
        }
        System.out.print(ans);
    }
}

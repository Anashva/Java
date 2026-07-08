package Lecture30_stack;


import java.util.Stack;
public class Largest_Rectangle_Histogram {
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(histogram(arr));
    }
    public static int histogram(int[] arr){
//        TC=>0(n)
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
//                    System.out.print(h*r+" ");
                    ans=Math.max(h*r,ans);
                }
                else{
                    int l=st.peek();
//                    System.out.print();
                    int area=h*(r-l-1);
//                    System.out.print(area+" ");
                    ans=Math.max(area,ans);
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty() ) {
            int h = arr[st.pop()];
            if (st.isEmpty()) {
                ans = Math.max(h * r, ans);
            } else {
                int l = st.peek();
                int area = h * (r - l - 1);
                ans = Math.max(area, ans);
            }
        }
        return ans;

    }
}

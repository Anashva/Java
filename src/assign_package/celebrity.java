package assign_package;

import java.util.Stack;

public class celebrity {
    public static void main(String[] args) {
        int[] [] arr={
                {0,0,1,0},
                {1, 0, 1, 0},
                {0,0,0,1},
                {0,0,0,0}
        };
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }
            else{
                st.push(a);
            }
        }
        int k=st.pop();
        for (int i=0;i<arr.length;i++){
            if(i==k){
                continue;
            }
            if(arr[i][k]==0 && arr[k][i]==1){
                System.out.print(-1);
                return;
            }
        }
        System.out.print(k);
    }
}

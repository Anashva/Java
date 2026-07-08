package Dynammic_programming;

public class uncrossed_line {
    public static void main(String[] args) {
        int[] num1={1,4,2,5};
        int[] num2={1,2,4,5};
        System.out.println(ul(num1,num2,0,0));
    }
    public static int ul(int[] num1,int[] num2,int i, int j){
        if(i==num1.length || j==num2.length){
            return 0;
        }
        int ans=0;
        if(num1[i]==num2[j]){
            ans=1+ul(num1,num2,i+1,j+1);
        }
        else{
            int l=ul(num1,num2,i+1,j);
            int r=ul(num1,num2,i,j+1);
            ans=Math.max(l,r);
        }
        return ans;
    }
}

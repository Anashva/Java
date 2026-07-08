package lecture20_recursion;

public class pn_decrement {
    public static void main(String[] args) {
        int n=5;
        pd(n);
    }
    public static void pd(int n){
        if(n==0) {//base case->O(n)
            return;
        }
        System.out.println(n);
        pd(n-1);
//        answer in growing phase
    }
}

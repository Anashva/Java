package lecture20_recursion;

public class pn_increment {
    public static void main(String[] args) {
        int n=5;
        pd(n);
    }
    public static void pd(int n){
        if(n==0) {//base case->O(n)
            return;
        }
        pd(n-1);
        System.out.println(n);
//        answer in downward phase
    }
}

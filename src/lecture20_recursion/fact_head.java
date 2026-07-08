package lecture20_recursion;

public class fact_head {
    public static void main(String[] args) {
//        recursion hamara pehla pyaar hai
        int n=5;
        System.out.println(facttorial(n));
    }

    public  static  int facttorial(int n){
//        anser bulid=stack downard me build ho rha tha(head recursion)
        if(n==0){//base case
            return 1;
        }
        int fn=facttorial(n-1); //sp
        return fn*n;//stackoverflow
//        10^4 frame will be formed in recursion and after that overflow exit-so basecase exit there in the form of condtion
    }

}

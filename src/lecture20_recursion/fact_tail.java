package lecture20_recursion;

public class fact_tail {
    public static void main(String[] args) {

//        recursion hamara pehla pyaar hai
        int n=5;
        System.out.println(facttorial(n,1));
    }

    public  static  int facttorial(int n,int ans){
        if(n==0){//base case
            return ans;
        }

        return facttorial(n-1,ans*n);//stackoverflow
//        10^4 frame will be formed in recursion and after that overflow exit-so basecase exit there in the form of condtion
    }
}

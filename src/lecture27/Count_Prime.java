package lecture27;

public class Count_Prime {
    public static void main(String[] args) {
        int n=10;
        System.out.print(isprime(n));

    }
    public static boolean isprime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}

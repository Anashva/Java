package lecture27;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n=100;
        System.out.print(PrimeSieve(n));
    }
//    jis index par 0 hai usko prime number bolenge
    public static int PrimeSieve(int n){
//        TC=>
        int[] ans=new int[n];
        ans[0]=ans[1]=1;
        for(int i=2;i*i<=ans.length; i++){
            if(ans[i]==0){//i is prime hai iske factor not prime hona chahiye
                for(int j=2;i*j<ans.length;j++){
                    ans[i*j]=1;
                }
            }
        }
        int c=0;
        for(int i=2;i<ans.length;i++){
            if(ans[i]==0){
                c++;
            }
        }
        return c;
    }
}

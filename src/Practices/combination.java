package Practices;

public class combination {
    public static void main(String[] args) {
        int n=5;
        int r=5;
        int ncr=fac(n)/(fac(r)*fac(n-r));
        System.out.print(ncr);

    }

    public static int fac(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 1;
        }
        int f=1;
        while(n>0){
            f*=n;
            n--;
        }
        return f;
    }
}

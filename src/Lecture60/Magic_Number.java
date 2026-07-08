package Lecture60;

public class Magic_Number {
    public static void main(String[] args) {
        int mul=5;
        int sum=0;
        int n=3 ;
        while(n>0){
            if((n & 1)!=0){
                sum+=mul;
            }
            n=n >>1;
            mul*=5;
        }
        System.out.println(sum);
    }
}

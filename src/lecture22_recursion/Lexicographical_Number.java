package lecture22_recursion;

public class Lexicographical_Number {
    public static void main(String[] args) {
        int n=10;
        lexicographical(n,0);
    }
    public static void lexicographical(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.print(curr+" ");
        int i=1;
        if(curr==0){
            i=1;
        }
        for( ;i<=9;i++){
            lexicographical(n,curr*10+i);//O(10^3)
        }
    }
}

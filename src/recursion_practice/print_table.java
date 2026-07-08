package recursion_practice;

public class print_table {
    public static void main(String[] args) {
        int n=2;
        print(n,1);
//        System.out.println();
    }
    public static void print(int n,int i){
        if(i>10){
            return ;
        }
        System.out.println(n*i);
        print(n,i+1);
    }
}

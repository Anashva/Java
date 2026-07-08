package assignment_1;
import java.util.*;
public class Alex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q>0){
            int A= sc.nextInt();
            int K= sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                if(A%price[i]==0){
                    c++;
                }
            }
            if(K==c){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }
}

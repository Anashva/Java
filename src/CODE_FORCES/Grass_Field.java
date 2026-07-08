package CODE_FORCES;

import java.util.Scanner;

public class Grass_Field {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=2;
            int[][] arr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int c=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==1){
                        c++;
                    }
                }
            }
            if(c==4){
                System.out.println(c/2);
            }
            else if(c>=2 && c<=3){
                System.out.println(c/2);
            }
            else{
                System.out.println(c);
            }

            t--;

        }
    }
}

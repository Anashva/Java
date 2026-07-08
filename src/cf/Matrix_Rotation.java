package cf;

import java.util.Scanner;

public class Matrix_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int [][] arr=new int[2][2];
            for(int i=0;i<2;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            boolean flag=false;
            for (int i=0;i<4;i++){
                int a=arr[0][0];
                int b=arr[0][1];
                int c=arr[1][0];
                int d=arr[1][1];
                if(a<b && a<c && b<d && c<d){
                    flag=true;
                    break;
                }
                int temp= arr[0][0];
                arr[0][0] = arr[1][0];
                arr[1][0] = arr[1][1];
                arr[1][1] = arr[0][1];
                arr[0][1] = temp;
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

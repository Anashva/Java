package cf;

import java.util.Scanner;

public class TC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<s.length();i++){
                char[] arr=s.toCharArray();
                if(arr[i]=='0'){
                    arr[i]='1';
                }
                else{
                    arr[i]='0';
                }
                for (char ch: arr){
                    if(ch=='1'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

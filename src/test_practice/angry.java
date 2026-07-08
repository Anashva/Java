package test_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class angry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int c=1;
        ArrayList<Integer> arr=new ArrayList<>();
        int e=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]==e){
                c++;
            }
            else{
                if(c==1){
                    arr.add(nums[i]);
                    c=1;
                    e=nums[i];
                }
                if(c==2){
                    arr.add(nums[i]);
                    c=1;
                    e=nums[i];
                }



            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}

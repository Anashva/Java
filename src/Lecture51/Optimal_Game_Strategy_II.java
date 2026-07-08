package Lecture51;

public class Optimal_Game_Strategy_II {
    public static void main(String[] args) {
        int[] arr={2,3,1,4};
        System.out.println(ogs(arr,0,arr.length-1));
    }
    public static int ogs(int[] arr,int i,int j){
        if(i>j){
            return 0;
        }
        int f=arr[i]+Math.min(ogs(arr,i+2,j),ogs(arr,i+1,j-1));
        int s=arr[j]+Math.min(ogs(arr,i+1,j-1),ogs(arr,i,j-2));
        return Math.max(f,s);
    }
}

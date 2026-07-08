package lecture27;

public class Partion_In_Array {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,12,6};
        System.out.println(partition(arr,0,arr.length-1));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int partition(int[] arr,int si,int ei){
        int item=arr[ei];
        int idx=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<=item){
                int t=arr[i];
                arr[i]=arr[idx];
                arr[idx]=t;
                idx++;
            }
        }
        int t=arr[ei];
        arr[ei]=arr[idx];
        arr[idx]=t;
        return idx;
    }
}

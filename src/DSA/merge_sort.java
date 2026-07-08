package DSA;

public class merge_sort {
    public static void conquer(int[] arr,int l,int mid,int h){
        int[] merged=new int[h-l+1];
        int idx1=l;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=h) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=h){
            merged[x++]=arr[idx2++];
        }
        for (int i=0,j=l;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[],int l,int h){
        if(l>=h){
            return;
        }
        int mid=l+(h-l)/2;
        divide(arr,l,mid);
        divide(arr,mid+1,h);
        conquer(arr,l,mid,h);
    }
    public static void main(String[] args) {
//        merge sort=divide and conquer
//        time complexity=O(nlogn)
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

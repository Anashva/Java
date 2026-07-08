package lecture11;

public class permutation {
    public static void next_permutation(int[] arr){
        int n=arr.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse_range(arr,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse_range(arr,p+1,arr.length-1);


    }
    public static void reverse_range(int arr[],int i, int j) {
        while(i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        next_permutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

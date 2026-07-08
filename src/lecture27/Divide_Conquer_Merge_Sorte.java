package lecture27;

public class Divide_Conquer_Merge_Sorte {
    public static void main(String[] args) {
//        DC=algorithm
//        DNC=>no overlapping because of partition
//        recursion=>overlapping exist because of same element exit
          int[] arr={5,7,3,4,2};
          int[] ans=sort(arr,0,arr.length-1);
          for(int i=0;i<ans.length;i++){
              System.out.print(ans[i]+" ");
          }

    }
    public static int[] sort(int[] arr,int si,int ei){
        if(si==ei){
//            int[] bs=new int[1];
//            bs[0]=arr[si];
            return new int[]{arr[si]};
        }
        int mid=(ei+si)/2;
        int[] a=sort(arr,si,mid);
        int[] b=sort(arr,mid+1,ei);
        return merge(a,b);

    }
    public static int[] merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] ans=new int[n+m];
        int k=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }
}

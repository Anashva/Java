package lecture17_string_arrayLIst;

public class DNFalgorithm {
    public static void main(String[] args) {
        int[] arr={0,1,2,1,2};
        sort(arr);
        for (int j=0;j<5;j++){
            System.out.println(arr[j]);
        }
    }
    public static void sort(int[] arr){
        int left=0;
        int i=0;
        int right=4;
        while(i<=right){
            if(arr[i]==0){
                int t=arr[i];
                arr[i]=arr[left];
                arr[left]=t;
                left++;
                i++;

            }
            else if(arr[i]==1){
                i++;
            }
            else{
                int t=arr[i];
                arr[i]=arr[right];
                arr[right]=t;
                right--;
//                i++;
            }
        }
    }

}

package lecture13;

public class transpose {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{11,12,13,14},{5,6,7,8},{22,23,24,25}};
//        int[][] arr1=new int[4][4];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

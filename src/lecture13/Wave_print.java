package lecture13;

public class Wave_print {
    public static void main(String[] args) {
//        jagged array=jiski column fixed na ho
        int[][] arr={{1,2,3,4},{11,12,13,14},{5,6,7,8},{22,23,24,25}};
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                   System.out.print(arr[i][j]+" ");
                }
            }
//            System.out.println();
        }

    }
}

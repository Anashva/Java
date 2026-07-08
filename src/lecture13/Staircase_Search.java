package lecture13;

public class Staircase_Search {
    public static boolean main(String[] args) {
        int target=0;
        int[][]matrix=new int[3][4];
        int n=0;
        int m=matrix[0].length-1;
        while(n<matrix.length && m>=0){
            if(matrix[n][m]==target){
                return true;
            }
            if(matrix[n][m]>target){
                m--;
            }
            else{
                n++;
            }
        }
        return false;
    }
}

package lecture_14;

public class Spiral_Matrix {
    public static void main(String[] args) {

        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}};
        Print(arr);
    }


    public static void Print(int[][] arr) {
        //square matrix
        int minc=0;
        int minr=0;
        int maxc=arr[0].length-1;
        int maxr=arr.length-1;
        int te=arr.length*arr[0].length;
        int c=0;
        while(c<te) {
            for (int i = minc; i <= maxc && c<te;  i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<te; i++) {
                System.out.print(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            for (int j = maxc; j >= minc && c<te; j--) {
                System.out.print(arr[maxr][j] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<te  ; i--) {
                System.out.print(arr[i][minc]+" ");
                c++;
            }
            minc++;

        }
    }
}
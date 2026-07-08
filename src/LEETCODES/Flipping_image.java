package LEETCODES;

public class Flipping_image {
    public static int[][] f_image(int[][] image){
        int[][] nums=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){

        }
        int[][] num=new int[nums.length][nums[0].length];
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==1){
                    num[i][j]=0;
                }
                else{
                    num[i][j]=1;
                }

            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        f_image(image);
        for(int i=0;i<image.length;i++){
            for(int j=0;j< image[0].length;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}

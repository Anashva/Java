package Lecture60;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,3};
        int xor=0;
        for(int i:nums){
            xor=xor ^ i;
        }
        System.out.println(xor);
    }
}

package lecture63;

public class Neighboring_Bitwise_XOR {
    public static void main(String[] args) {

    }
    public static boolean valid(int[] arr){
        int xor=0;
        for(int i:arr){
            xor ^=i;
        }
        return xor==0;
    }
}


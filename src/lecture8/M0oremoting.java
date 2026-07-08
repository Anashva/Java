package lecture8;

public class M0oremoting {
    public static int Moremoting(int[] arr){
        int e=arr[0];
        int v=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==e){
                v++;
            }
            else{
                v--;
                if(v==0){
                    e=arr[i];
                    v=1;
                }
            }
        }
        return e;
    }

    public static void main(String[] args) {
        int[] arr={2,3,7,2,7,2,7,7,7,3,7};
//        Moremoting(arr);
        System.out.print(Moremoting(arr));
    }
}

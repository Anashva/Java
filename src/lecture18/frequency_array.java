package lecture18;

public class frequency_array {
    public static void main(String[] args) {
        int[] arr=new int[26];
        int[] arr1=new int[256];
        String s="aaaabc";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr[idx]++;    // arr[idx]=arr[idx]+1
            arr1[ch]++;    // arr[ch]=arr[ch]+1

        }
        for (int k:arr){
            System.out.print(k+" ");
        }
//        System.out.println();
//        for (int k:arr1){
//            System.out.print(k+" ");
//        }
    }
}

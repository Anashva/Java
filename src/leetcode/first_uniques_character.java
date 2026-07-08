package leetcode;

public class first_uniques_character {
    public static void main(String[] args) {
        String s="leetcode";
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int k = (int) ch - 97;
            arr[k]++;
            System.out.print(arr[k] + " ");
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int j=(int)c-97;
            if(arr[j]==1){
                System.out.print(i);
                break;
            }
        }
    }
}

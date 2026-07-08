package lecture16_String_Important;
import java.util.Arrays;
public class reverse_word {
    public static void main(String[] args) {
        String s="  the sky is p blue     " ;
        s=s.trim();
        String [] arr=s.split("\s+");
//        \s+ = to remove multiple space , + to remove one space
        System.out.println(Arrays.toString(arr));
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        System.out.print(ans.trim());
    }

}

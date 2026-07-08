package lecture31;
import java.util.*;
public class jp2 {
    public static void main(String[] args) {
        int [] arr={1,2,20,8,8,1,2,5,8,0};
        int n=10;
        int x=8;
        int [] query={100,2,1,3,4};
        int[] answer=new int[query.length];
        Arrays.fill(answer,-1);
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                c++;
//                System.out.println(c);
                int j=0;
                while(j<query.length){
                    if(c==query[j]){
                        answer[j]=i+1;
                        break;
                    }
                    j++;
                }
            }
        }
        for (int val:answer){
            System.out.print(val+" ");
        }
    }
}

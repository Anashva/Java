package jpmc;
import java.util.*;
public class haa {
    public static void main(String[] args) {
        int[] array={1,3,3,4,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int n:array){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map.get(3));
        for (Integer k: map.keySet()){
            if(k>1){
                c++;
            }
        }
        System.out.println(c);
//
//        String s="7596801";
//        char[] arr=s.toCharArray();
//        String ans="";
//        for(int i=0;i<s.length()-1;i++){
//            for(int j=i+1;j<s.length();j++){
//                int n1=s.charAt(i)-'0';
//                int n2=s.charAt(j)-'0';
//                if(n2>n1)
//                    if(n1%2!=0 && n2%2!=0){
//                        char t=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=t;
//
//                }
//                else if(n1%2==0 && n2%2==0){
//                    if(n2>n1){
//                        char t=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=t;
//                    }
//                }
//            }
//            }
//        for(char ch:arr){
//            ans+=ch;
//        }
//        System.out.println(ans);



                String s = "7596801";
                char[] arr = s.toCharArray();

                List<Character> oddList = new ArrayList<>();
                List<Character> evenList = new ArrayList<>();

                // Separate odd and even digits
                for (char ch : arr) {
                    if ((ch - '0') % 2 == 0) {
                        evenList.add(ch);
                    } else {
                        oddList.add(ch);
                    }
                }

                // Sort odd and even numbers in descending order
                oddList.sort(Collections.reverseOrder());
                evenList.sort(Collections.reverseOrder());

                // Reconstruct the string
                StringBuilder result = new StringBuilder();
                int oddIndex = 0, evenIndex = 0;

                for (char ch : arr) {
                    if ((ch - '0') % 2 == 0) {
                        result.append(evenList.get(evenIndex++));
                    } else {
                        result.append(oddList.get(oddIndex++));
                    }
                }

                System.out.println(result.toString());


    }
}

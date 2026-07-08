import java.util.*;

public class beautiful {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            List<Integer> arr=new ArrayList<>();
            for (int i=0;i<s.length();i++){
                arr.add(s.charAt(i)-'0');
            }
            Collections.sort(arr);
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<10;i++) {
                int k=10-(i+1);
                boolean flag=false;
                for (int j = 0; j < arr.size(); j++) {
                    if(arr.get(j)>=k){
                        sb.append(arr.get(j));
                        arr.remove(j);
                        flag=true;
                        break;
                    }
                }
                if (!flag){
                    sb.append(arr.get(0));
                    arr.remove(0);

                }
            }
            System.out.println(sb.toString());

        }
    }
}

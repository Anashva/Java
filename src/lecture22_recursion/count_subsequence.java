package lecture22_recursion;

public class count_subsequence {

//    public static int count_sub(String ques, String ans) {
//        if(ques.length() == 0) {
//            System.out.print(ans+" ");
//            return 1;
//        }
//
//        char ch=ques.charAt(0);
//        int a=count_sub(ques.substring(1), ans);
//        int b=count_sub(ques.substring(1), ans+ch);
//        return a+b;
//    }
public static void main(String[] args) {
    String ques="aba";
//        String ans="";
    printt(ques,"");
    System.out.print("\n"+count);

}
    static int count=0;
    public static void printt(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.print(ans +" ");
            count++;
            return ;
        }
        char ch=ques.charAt(0);
        printt(ques.substring(1), ans);
        printt(ques.substring(1), ans+ch);
    }
//public static void printt(String ques) {
//    if(ques.length() == 0) {
////            System.out.print(ans +" ");
//        count++;
//        return ;
//    }
//    char ch=ques.charAt(0);
//    printt(ques.substring(1));
//    printt(ques.substring(1));
//}

}


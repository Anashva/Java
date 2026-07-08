package lecture16_String_Important;

public class pallindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.print(ispall(s));

        }

    public static boolean ispall(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

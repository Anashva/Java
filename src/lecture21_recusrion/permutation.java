package lecture21_recusrion;
public class permutation {
    public static void main(String[] args) {
        String s="abcd";
        permute(s,"");
    }
    public static void permute(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            permute(s1+s2,ans+ch);
        }
    }
}

package lecture21_recusrion;

public class permuattion2 {
    public static void main(String[] args) {
        String s="cbac";
//        permute(s,"");
        permute(s,"");

    }
    public static void permute(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!isvalid(s,ch,i+1)){
                String s1=s.substring(0,i);
                String s2=s.substring(i+1);
                permute(s1+s2,ans+ch);
            }

        }
    }
    public static  boolean isvalid(String s,char ch,int j){
        for(int i=j;i<s.length();i++){
            if(s.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}

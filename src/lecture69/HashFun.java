package lecture69;


public class HashFun {
    public static void main(String[] args) {
        String s="apple";
        System.out.println(HashCode(s));
    }
    public static long HashCode(String s){
        long hv=0;
        long pow=1;
        long pr=31;
        long mod=1000000007;
        for(int i=0;i<s.length();i++){
            hv=(hv+((s.charAt(i)-'a'+1)*pow)%mod)%mod;
            pow=(pow*pr)%mod;
        }
        return hv;
    }
}

package lecture18;

public class string_builder_demo2 {
    public static void main(String[] args) {
        string_builder();
        stirngbuilder();

    }
    public static void string_builder(){
        String s="";
        for(int i=0;i<100;i++){
            s=s+i;
        }
        System.out.println(s);
    }
    public static void stirngbuilder(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100;i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}

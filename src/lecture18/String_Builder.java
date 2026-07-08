package lecture18;

public class String_Builder {
    public static void main(String[] args) {
//        STRING BUILDER-unsyncronized,optemize,mutable - 2*(old capacity)+2=new capacity
//        vector =2*old capacity in java
//        arraylist=1.5 capacity increase
//        string buffer-synchronized
        StringBuilder sb=new StringBuilder("hello");//characater array-capacity-16+5=21(hello)
//        16+string length=capacity
//        default capacity-16
//        return always strinf not string builder
        System.out.println(sb.capacity());
        sb.append(" dhoni ");
        sb.append(true);//koi bhi chij ada kroge to add ho jaega
        sb.append(7);
        System.out.println(sb);//hello dhoni true7
        System.out.println(sb.length());//17
        System.out.println(sb.charAt(2));//l
        System.out.println(sb.reverse());//7eurt inohd olleh
        System.out.println(sb.delete(1,6));//7inohd olleh
        System.out.print(sb.substring(1,6));//inohd

//        string buiilder +string
        String s=sb.toString();
        System.out.println(s);
        String str="  ksjehkdhewiufwehfuihewu";
        sb.append(str);
        System.out.println(sb);

    }
}

package lecture16_String_Important;
import java.util.*;
public class string_introduction {
    public static void main(String[] args) {
        String sl="hello ";
        String sl1="hello ";
        String sl2=new String("hello ");
        String sl3=new String("hello ");
        System.out.println(sl1==sl);
        System.out.println(sl2==sl);
        System.out.println(sl3==sl2);
        System.out.println(sl);
        sl=sl+" bye";
        sl=sl.concat("world");
        String sl5="hello "+ "bye";
        String sl6="hello " +"bye";
        System.out.print(sl5==sl6);
    }
}

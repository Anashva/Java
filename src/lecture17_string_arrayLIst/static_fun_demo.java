package lecture17_string_arrayLIst;

public class static_fun_demo {
    static  int vaal=100;
    public static void main(String[] args) {
        System.out.println(vaal);//100

        System.out.println(add(5,7));
//        agr ab iske niche ab acess kreneg to 105 aaega
        System.out.println(vaal);
    }
    public static int add(int a, int b){
        int vaal=90;// ye bhi 100 dega
        static_fun_demo.vaal=static_fun_demo.vaal+5;
        return a+b;
    }
}

package lecture33_Inheritene;

public class client {
    public static void main(String[] args) {
//        case-1(no inheritence)=no child access
//        p obj=new p();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();


//======================================================================================================================
//        case-2(method overwrite)
//        p obj=new c();
//        System.out.println(obj.d);//1-object of p type for jvm
//        System.out.println(((c)obj).d2);// not accessable-compile type error-typecast can be done=20
//        System.out.println(((c)obj).d);//2
//        obj.fun();// fun in c-code jab likh rhe h p ko call kr rha hai lekin c k blueprint me pehle jake dekhega
//        obj.fun1();//fun1 in p
////        variable kisi bhi product ki functionality ko change nhi  krta h but method  ch eck krta

// ===================================================================================================================
//        case-3(no inheretence is alllowed )-cannot be handle -rutnime error

//        c obj=new p();//c ka type hoga aur object p ka hoga aur complier ka c ka bolega krne ko koi dikkt nhi hai-runtime error-cannot be handle
//        System.out.println(obj.d);
//        System.out.println(obj.d1);


//        ======================================================================
//        cas-4
        c obj=new c();
        obj.fun();//fun in c
        obj.fun2();// fun2 in c
        obj.fun1();//fun1 in p
        System.out.println(obj.d1);//10


    }
}

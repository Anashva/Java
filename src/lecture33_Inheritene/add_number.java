package lecture33_Inheritene;

public class add_number {
//    method overloading-

    public static void main(String[] args) {
        System.out.println(add(2,7));
        System.out.println(add(2,5,6));
        System.out.println(add(4,7,9.0));
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,double c){
        return (int)(a+b+c);
    }
    public  static int add(int ...a){//variable no of argument or triple dot argument->aur sbse last me hoga argument me
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}

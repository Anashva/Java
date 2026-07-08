package OOPS_LECTURE1;

public class mycal extends cal{
    public void sub(int x,int y){
        ans=x*y;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        mycal c=new mycal();
        c.add(a,b);
        c.sub(a,b);
    }
}

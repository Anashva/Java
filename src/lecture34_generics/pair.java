package lecture34_generics;

public class  pair <T,P> {
  T  x;
  P  y;
  public pair(T x, P y){
      this.x=x;
      this.y=y;
  }
  public pair(){

  }
  public  T getx(){
      return x;
  }

    public static void main(String[] args) {
        pair<Integer,Character> p1=new pair<>();
        pair<String,Boolean> p2=new pair<>();

    }

}

package lecture34_generics;

public class car_client {
    public static void main(String[] args) {
        Cars[] arr=new Cars[5];
//        jab tak object nhi banega tab tak car nhi banega
        arr[0]=new Cars(200,10,"White");
        arr[1]=new Cars(1000,20,"Black");
        arr[2]=new Cars(3405,3,"Yellow");
        arr[3]=new Cars(34,89,"Grey");
        arr[4]=new Cars(8796,6,"Red");
        Display(arr);
    }
    public static void Display(Cars[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

package lecture35_interface;


import java.util.*;

public class Cars_client {
    public static void main(String[] args) {
        Cars[] arr=new Cars[5];
//        jab tak object nhi banega tab tak car nhi banega
        arr[0]=new Cars(200,10,"White");
        arr[1]=new Cars(1000,20,"Black");
        arr[2]=new Cars(3405,3,"Yellow");
        arr[3]=new Cars(34,89,"Grey");
        arr[4]=new Cars(8796,6,"Red");
//        Arrays.sort(arr);//error
        //bubblesort(arr);
        Arrays.sort(arr,new Comparator<Cars>() {
           public int compare(Cars o1, Cars o2){
               return o1.speed-o2.speed;
           }
        });//<>-value insert karani h cars
        Display(arr);
    }
    public static void Display(Cars [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static <T extends Comparable<T>> void bubblesort(  T[] arr){//set the bound
        int n=arr.length;
        for(int i=1;i<n;i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j].compareTo(arr[j + 1])>0) {// we cannnot compare 2 address
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


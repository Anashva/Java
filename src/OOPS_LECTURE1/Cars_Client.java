package OOPS_LECTURE1;

//import LECTURE10.STRING.Arrays;
import java.util.Arrays;
import java.util.Comparator;

public class Cars_Client {
    public static void main(String[] args) {
//        int[] arr=new int[5];
        Cars[] arr=new Cars[5];//cars array
        arr[0]=new Cars(200,10,"White");
        arr[1]=new Cars(30,18,"Black");
        arr[2]=new Cars(1900,40,"Grey");
        arr[3]=new Cars(4050,12,"Pink");
        arr[4]=new Cars(8000,6,"Blue");
//        sort(arr);
        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o2.speed-o1.speed;
            }
        });

        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o2.price-o1.price;
            }
        });
        Display(arr);
    }
    public static void Display(Cars[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

//    aisa vaisa koi T nhi aaega ,jiski comparison logic likhi gyi hogi vhi aaega T
    public static <T extends Comparable<T>> void sort(T[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
//                if(arr[j].compareTo(arr[j+1])<0){ //address cannot be compare
//                    T temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
                if(arr[j].compareTo(arr[j+1])>0){ //address cannot be compare// badi value ko aage rakhna hai
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

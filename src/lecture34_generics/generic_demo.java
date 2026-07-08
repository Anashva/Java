package lecture34_generics;

import java.util.concurrent.ThreadPoolExecutor;

public class generic_demo {
    public static void main(String[] args) {
//        generic-non premitive data
        Integer [] arr={10,20,40,4,60};
        Display(arr);
        String[] arr1={"Kaju","Raju","Ankit","Ankita"};
        Display(arr1);
//        generic me return types se pehle angular bracket me jo dil chahe likh do
    }
    public static <D>void Display(D[] arr){
//        <D>-dataype
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static <D> D get(D[] arr){
        return arr[0];
    }
}

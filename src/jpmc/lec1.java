package jpmc;

//import lecture31.Hashmap;
import java.util.*;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class lec1 {
    public static void main(String[] args) {
//        stream api
//        1-convert array to stream
        int[] arr={4,46,55,35,3,35,45,46,654,4};
        System.out.println(arr.length);
        Arrays.stream(arr)
                .filter(var-> var%2==0)
                .forEach(System.out::println);//for each-terminal method and it will be in string
        int sum=Arrays.stream(arr)//O(1)
                .sum();
        System.out.println(sum);
//        int re=0;
//        for (int i:arr){
//            re+=i;//O(n)
//        }
//        System.out.println(re);
        long count= Arrays.stream(arr)
                .distinct()
                .count();
        System.out.println(count);

//        sum of odd element
        int odd=Arrays.stream(arr)
                .filter(ele -> ele%2!=0)
                .sum();
        System.out.println(odd);

        int even=Arrays.stream(arr)
                .filter(ele -> ele%2==0)
                .sum();
        System.out.println(even);

//        max of array
        IntStream stream= Arrays.stream(arr);
        OptionalInt mx=stream.max();//it will be used here and cannot be used further
        System.out.println(mx);
//        int max=stream.max().orElse(-1);//or getasInt()
//        System.out.println(max);

//        min of array
//        int min=

//        sorting
        Arrays.stream(arr)
                .sorted()//it sort only element not original array
                .filter(ele -> ele%5==0)//sort acc. to 5 multiple

                .forEach(var -> System.out.printf("%d ",var));

        System.out.println("\n"+arr[0]);

        String str[]={"1","2","57","34"};
         odd=Arrays.stream(str)
                 .mapToInt(Integer:: parseInt)
                .filter(ele -> ele%2!=0)
                .sum();
         System.out.println(odd);
//         int[] array={1,3,3,4,4,4};
//        Hashmap<Integer,Integer> mp=new Hashmap<>();
//
//

    }
}

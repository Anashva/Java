package Lecture60;

public class Bitmasking {
//    bit-> 0/1
//    mask-> variable
//>> right shift
//    << left shift--> n*2^m--> 13<<1
//    comapritively-->fast-bitwise faster than logical operator
//    tc is constant for both-O(1)
//     (n & 1)==1 --> odd else even

//
public static void main(String[] args) {
    int n=35;
    if((n & 1)==1){
        System.out.println("odd");
    }
    else{
        System.out.println("even");
    }

    int m=Integer.MIN_VALUE <<1;
    System.out.println(m);//0

//    right shift:- a>>n  => a/2^n
//    17>>1--> 17/2

//    if a is negative ->





}

}

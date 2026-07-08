package lecture20_recursion;

public class first_occurance_array {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,4,3,7};
        int item=4;
        System.out.println(occurence(arr,item,0));
    }
    public static int occurence(int[] arr,int item,int i){
        if(i==arr.length){//base condtion-growing phase(tale recursion)=>O(n)
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return occurence(arr,item,i+1);

    }

}


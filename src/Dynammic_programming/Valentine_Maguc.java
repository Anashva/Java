package Dynammic_programming;

import java.util.Arrays;

public class Valentine_Maguc {
    public static void main(String[] args) {
        int[] boy={2,11,3};
        int[] girl={5,7,3,2};
        Arrays.sort(boy);
        Arrays.sort(girl);
        System.out.println(vm(boy,girl,0,0));
    }
    public static int vm(int[] boys,int [] girls,int i,int j){
        if(i== boys.length){
            return 0;
        }
        if(j== girls.length){
            return 1000000;
        }

        int pair=Math.abs(boys[i]-girls[j])+vm(boys,girls,i+1,j+1);//agr boy girl ko chhose karge to dono ki index aage bad jaegi
        int no_pair=vm(boys, girls, i, j+1);//agr nhi choose krega to girl ki index aage bad jaegi

        return Math.min(pair,no_pair);
    }

}

package lecture28_timecomplexity_recursion;

import java.util.Random;

public class random_number {
    public static void main(String[] args) {
        int si=10;
        int ei=100;
        Random rm=new Random();
        for(int i=0;i<10;i++){
            int x=rm.nextInt(ei-si+1)+si;//0-90
            System.out.println(x);
        }

    }

}

package LECTURE10.STRING;
import java.util.*;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch (age){
            case 18:
                System.out.print("you are adult");
                break;
            case 23:
                System.out.print("you are going to get job");
                break;
            case 60:
                System.out.print("you are going to become senior");
                break;
            default:
                System.out.println("enjoy your life");
        }
        System.out.print("thanks for using switch case");
    }
}

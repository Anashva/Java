package oops_practice;

import java.util.*;

public class Card implements Payment{
    public void pay(){
        System.out.println("Pay via Card");
    }

    public static void main(String[] args) {
        List<Payment> ll=new ArrayList<>();
        ll.add(new UPI());
        ll.add(new Card());
        for (Payment p:ll){
            p.pay();
        }
    }
}

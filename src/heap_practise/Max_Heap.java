package heap_practise;

import java.util.*;

public class Max_Heap {
    private ArrayList<Integer> ll=new ArrayList<>();
    public void add(int item){
        ll.add(item);
        unheapify(ll.size()-1);
    }
    private void unheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)<ll.get(ci)){
            swap(pi,ci);
            unheapify(pi);
        }
    }
    public void swap(int pi,int ci){
        int p=ll.get(pi);
        int c=ll.get(ci);
        ll.set(pi,c);
        ll.set(ci,p);
    }
    public int get(){
        return ll.get(0);
    }
    public int remove(){
        swap(0,ll.size()-1);
        int rv=ll.remove(ll.size()-1);
        downheapify(0);
        return rv;
    }
    private void downheapify(int pi){
        int maxi=pi;
        int lci=2*pi+1;
        int rci=2*pi+2;
        if(lci<ll.size() && ll.get(lci)>ll.get(maxi)){
            maxi=lci;
        }
        if(rci<ll.size() && ll.get(rci)>ll.get(maxi)){
            maxi=rci;
        }
        if(maxi!=pi){
            swap(pi,maxi);
            downheapify(maxi);
        }

    }
    public void display(){
        System.out.println(ll);
    }

    public static void main(String[] args) {
        Max_Heap hp=new Max_Heap();
        hp.add(30);
        hp.add(20);
        hp.add(10);
        hp.add(5);
        hp.add(21);
        hp.add(-4);
        hp.add(6);
        hp.add(1);
        hp.add(3);
        hp.display();

    }
}

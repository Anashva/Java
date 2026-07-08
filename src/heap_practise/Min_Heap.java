package heap_practise;

import java.util.*;
public class Min_Heap {
    private ArrayList<Integer> ll=new ArrayList<>();
    public void add(int item){
        ll.add(item);
        unheapify(ll.size()-1);
    }
    private void unheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
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
    public int size(){
        return ll.size()-1;
    }
    public int remove(){
        swap(0,ll.size()-1);
        int rv=ll.remove(ll.size()-1);
        downheapify(0);
        return rv;
    }
    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<ll.size() && ll.get(lci)<ll.get(mini)){
            mini=lci;
        }
        if(rci<ll.size() && ll.get(rci)<ll.get(mini)){
            mini=rci;
        }

        if(mini!=pi){
            swap(pi,mini);
            downheapify(mini);
        }
    }
}

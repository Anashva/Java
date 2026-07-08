package Lecture39;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> ll=new ArrayList<>();
    public void  add(int item){
//        tc->Log(n)
        ll.add(item);
        upheapify(ll.size()-1);
    }
    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    private void  swap(int pi,int ci){
        int t=ll.get(pi);
        int tt=ll.get(ci);
        ll.set(pi,tt);
        ll.set(ci,t);

    }

    public int remove(){
        swap(0,ll.size()-1);
        int val=ll.remove(ll.size()-1);
        downheadpif(0);
        return val;
    }
    private void downheadpif(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;

        if(lci<ll.size() && ll.get(mini)>ll.get(lci)){
            mini=lci;
        }
        if(rci<ll.size() && ll.get(mini)>ll.get(rci)){
            mini=rci;
        }
        if (mini!=pi){
            swap(mini,pi);
            downheadpif(mini);
        }
    }
    public int get(){
        return ll.get(0);
    }
    public int size(){
        return ll.size();
    }
    public void Display(){
        System.out.println(ll);
    }

    public static void main(String[] args) {
//        heap:-priority queue and heap working is same
//        marks-value jyada prority jyada-->max heap
//        rank-value kam uski, priority jyada-->min heap
//        heap-it is complete binary tree
//        if l is level of binary tree then l-1 level has complete fill tree -->first left then right
//        parent priority>child priority
//        min heap-parent vlue must be less than both child value
//        max heap-parent ka data jyada hona chahiye dono child k data se
//        min heap me top par sbse minimum data hoga heap me
//        max heap me top par sbse maximum data hoga heap me
//        heap ?--.
//        sorted array:-add:->O(n)
//        unsorted:-add:-->O(1)
//        heap:-add:-->log(n)
//        minumum element remove:-sorted array-->O(n) ,unsorted array-O(n),heap-->log(n)
//        get minimum:-sorted array->O(1) ,unsorted array->O(n) ,heap-> O(1)
//        upheapify->to make in heap
    }
}

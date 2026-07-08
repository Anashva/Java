package Practices;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        ArrayList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Merged list: " + mergedList);

    }
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

}

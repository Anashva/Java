package Lecture42;
import java.util.*;
public class Tree_Top_View {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    static TreeNode root;
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map =new TreeMap<>();
        List<Integer> ll=new ArrayList<>();
        view(root,ll,0,map);
        for(int key:map.keySet()){
            ll.add(map.get(key));
        }
        System.out.println(ll);
    }
    public static  void  view(TreeNode root,List<Integer> ll,int curr,TreeMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        if(!map.containsKey(curr)){
            map.put(curr,root.val);
        }
        view(root.left,ll,curr-1,map);
        view(root.right,ll,curr+1,map);
    }
}

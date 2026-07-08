package Lecture37_BST;

import BInary_TreeBT.Createe_tree_using_level_order;

public class    BST {
//    inorder binary tree in sorted way is always bst-property
//    bst is bt but opposite is not true
//    bt and bst have same structure
//    bst:-
//    leaf node ia always part of bst
//    bst ka inorder always sorted hoga
//    bst k andar duplicate data nhi hoga
//    squed tree-left or right oriented
    class Node {
    int val;
    Node left;
    Node right;
}
    private  Node root;
    public  BST(int[] in){
        root= CreateTree(in,0,in.length-1);
    }
    private Node CreateTree(int[] in,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid =(si+ei)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left=CreateTree(in,si,mid-1);
        nn.right=CreateTree(in,mid+1,ei);
        return nn;
    }

}

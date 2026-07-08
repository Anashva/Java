package Lecture_Tree;

import java.util.Scanner;

public class Binary_Tree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public Binary_Tree(){
        root =CreateTree();
    }

    private  Node CreateTree(){
//        2 choice -2 call
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();//has left child
        if(hlc){
            nn.left=CreateTree();
        }
        boolean hrc=sc.nextBoolean();//has right child
        if(hrc){
            nn.right=CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn) {
        if(nn==null){
            return;
        }
        String str="<--"+nn.val+"-->";
        if(nn.left!=null){
            str=nn.left.val+str;
        }
        else{
            str="."+str;
        }
        if(nn.right!=null){
            str=str+nn.right.val;
        }
        else{
            str=str+".";
        }
        System.out.println(str);
        Display(nn.left);
        Display(nn.right);

    }
}

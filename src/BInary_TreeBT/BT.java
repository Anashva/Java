package BInary_TreeBT;

import Lecture_Tree.Binary_Tree;

import java.util.LinkedList;
import java.util.Scanner;

public class BT {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public BT(){
        root=createtree();
    }
    private Node createtree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=createtree();
        }
        boolean hrc=sc.nextBoolean();
        if (hrc){
            nn.right=createtree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }

    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s="";
        s="<--"+nn.val+"-->";
        if(nn.left!=null){
            s=nn.left.val+s;
        }
        else{
            s="."+s;
        }
        if(nn.right!=null){
            s=s+nn.right.val;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(node.left);
        int rmax=max(node.right);
        return Math.max(node.val,Math.max(lmax,rmax));
    }
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        boolean lroot=find(nn.left,item);
        boolean rroot=find(nn.right,item);

        return lroot || rroot;
    }
    public int ht(){
        return ht(this.root);
    }
    private int ht(Node node){
        if(node==null){
            return -1;
        }
        int lh=ht(node.left);
        int rh=ht(node.right);
        return Math.max(lh,rh)+1;
    }
    public void preorder(){
        preorder(this.root);
        System.out.println();
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(this.root);
        System.out.println();
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }

        preorder(node.left);
        System.out.print(node.val+" ");
        preorder(node.right);
    }

    public void postorder(){
        postorder(this.root);
        System.out.println();
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.val+" ");
    }
    public void levelOrder(){
        LinkedList<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove();//remove first
            System.out.print(rv.val+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}

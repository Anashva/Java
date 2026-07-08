package lecture36_Tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Tree_ques {
    class Node{
        int val;
        Tree_ques.Node left;
        Tree_ques.Node right;
    }
    private Tree_ques.Node root;
    Scanner sc=new Scanner(System.in);
    public Tree_ques(){
        root =CreateTree();
    }

    private Tree_ques.Node CreateTree(){
//        2 choice -2 call
        int item=sc.nextInt();
        Tree_ques.Node nn=new Node();
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
    public  boolean find(int item){
        return find(root,item);
    }
    private   boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        boolean left=find(nn.left,item);
        boolean right=find(nn.right,item);
        return left || right;
    }
    //    maximum of bt
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(nn.left);
        int rmax=max(nn.right);
        return Math.max(nn.val,Math.max(lmax,rmax));
    }
    public int min(){
        return min(root);
    }
//    minimum of bt
    private int min(Node nn){
        if(nn==null){
            return Integer.MAX_VALUE;
        }
        int lmax=min(nn.left);
        int rmax=min(nn.right);
        return Math.min(nn.val,Math.min(lmax,rmax));
    }
//height of root
//    single root height-0 or 1
public int ht(){
    return ht(root);
}
private  int ht(Node nn){
        if(nn==null){
            return -1;
        }
        int lh=ht(nn.left);
        int rh=ht(nn.right);
        return Math.max(lh,rh)+1;
}
    public void preorder_traversal() {
        preorder_traversal(root);
        System.out.println();
    }
    private  void preorder_traversal(Node nn){
        if(nn==null){
            return;
        }
        System.out.print(nn.val+" ");
        preorder_traversal(nn.left);
        preorder_traversal(nn.right);
    }
    public void Inorder(){
         Inorder(root);
         System.out.println();
    }
    private void Inorder(Node nn){
        if(nn==null){
            return;
        }
        preorder_traversal(nn.left);
        System.out.print(nn.val+" ");
        preorder_traversal(nn.right);
    }
    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }
    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }
        preorder_traversal(nn.left);
        preorder_traversal(nn.right);
        System.out.print(nn.val+" ");
    }
    public void lavel_of_traversal() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);//addlast
        while (!q.isEmpty()) {
            Node n = q.poll();//q.remove(}-.removefirst
            System.out.print(n.val+" ");
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
        System.out.println();
    }

//    private void level_of_traversal(Node nn){
//
//    }

}

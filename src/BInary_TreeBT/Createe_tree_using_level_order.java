package BInary_TreeBT;

import Binary_Tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Createe_tree_using_level_order {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val=val;
        }
    }
    private TreeNode root;
    public Createe_tree_using_level_order(){
        createTree();
    }
    private void createTree(){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        TreeNode node=new TreeNode(c);
        root=node;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            TreeNode rv=q.poll();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                TreeNode nn=new TreeNode(c1);
                rv.left=nn;
                q.add(nn);
            }
            if(c2!=-1){
                TreeNode nn=new TreeNode(c1);
                rv.right=nn;
                q.add(nn);
            }
        }
    }
    public void Display(){
        Display(root);
    }

    private void Display(TreeNode nn){
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

    public static void main(String[] args) {
         Createe_tree_using_level_order cl=new Createe_tree_using_level_order();
         cl.Display();
    }
}

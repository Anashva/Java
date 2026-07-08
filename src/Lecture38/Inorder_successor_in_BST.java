package Lecture38;


public class Inorder_successor_in_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    class  Solution{
        TreeNode successorNode=null;
        public  TreeNode inordersucc(TreeNode root,TreeNode n){
            return Successor(root,n);
        }
        public  TreeNode Successor(TreeNode root, TreeNode p){
            if(root==null){
                return null;
            }
            if(root.val>p.val){
                successorNode =root;
                Successor(root.left,p);
            }
            else{
                Successor(root.right,p);
            }
            return successorNode;
        }
    }
    public static void main(String[] args) {

    }
}

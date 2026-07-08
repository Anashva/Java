package BInary_TreeBT;

public class BT_Client {
    public static void main(String[] args) {
        BT bt=new BT();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(65));
        bt.preorder();
        bt.postorder();
        bt.inorder();
        bt.levelOrder();
    }
}

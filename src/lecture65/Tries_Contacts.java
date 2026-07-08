package lecture65;

import java.util.*;
public class Tries_Contacts {
    class Node{
        char ch;
        boolean isterminal;
        HashMap<Character, Node> child;
        int count=1;
        public Node(char ch){
            this.ch=ch;
            child=new HashMap<>();
        }


    }
    private Node root;
    public Tries_Contacts(){
        root=new Node('*');//root node
    }
    public  void add(String word){
//        tc-> word.length
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
                curr.count++;
            }
            else{
                Node nn=new Node(ch);
                curr.child.put(ch,nn);
                curr=nn;
            }
        }
        curr.isterminal=true;
    }
    public int find(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return 0;
            }
        }
        return curr.count;
    }
}


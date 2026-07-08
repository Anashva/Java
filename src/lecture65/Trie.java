package lecture65;

import java.util.*;
public class Trie {
    class Node{
        char ch;
        boolean isterminal;
        HashMap<Character,Node> child;
        public Node(char ch){
            this.ch=ch;
            child=new HashMap<>();
        }
    }
    private Node root;
    public Trie(){
        root=new Node('*');//root node
    }
    public  void insert(String word){
//        tc-> word.length
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                Node nn=new Node(ch);
                curr.child.put(ch,nn);
                curr=nn;
            }
        }
        curr.isterminal=true;
    }
    public boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return false;
            }
        }
        return curr.isterminal;
    }
    public boolean startsWith(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
}

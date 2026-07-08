package lecture66;

import java.util.*;
public class Replace_Words {
    public static void main(String[] args) {
        String[] dic={"cat","bat","rat"};
        Trie t=new Trie();
        for (String s:dic){
            t.insert(s);
        }
        String sen="the cattle was rattled by the battery";
        String[] arr=sen.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<arr.length;i++){
            String get=t.search(arr[i]);
            sb.append(get).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    static class Trie{
        class Node{
            char ch;
            String isTerminal;
            HashMap<Character,Node> child;
            public Node(char ch){
                this.ch=ch;
                child=new HashMap<>();
            }
        }
        private Node root=new Node('*');

        public  void insert(String word){
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
            curr.isTerminal=word;
        }
        public String search(String word){
            Node curr=root;
            for (int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(curr.child.containsKey(ch)){
                    curr=curr.child.get(ch);
                    if(curr.isTerminal!=null){
                        return curr.isTerminal;
                    }
                }
                else{
                    return word;
                }
            }
            return word;
        }
    }
}

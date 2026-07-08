package Infix_post_prefix;

import java.util.Stack;

public class Infix_to_Prefix {
    public static void main(String[] args) {
        String s="9-5+3*4/6";
        Stack<String> s1=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                s1.push(""+ch);
            }
            else if (op.size()==0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                String v2=s1.pop();
                String v1=s1.pop();
                String res=op.peek()+v1+v2;
                s1.push(res);
                op.pop();
            }
                op.pop();//(
            }
            else { // operator
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    String v2 = s1.pop();
                    String v1 = s1.pop();
                    char operator = op.pop();
                    String res = operator + v1 + v2;
                    s1.push(res);
                }
                op.push(ch);
            }
        }
        while(s1.size()>1){
            String v2=s1.pop();
            String v1=s1.pop();
            String res=op.peek()+v1+v2;
            s1.push(res);
            op.pop();
        }
        String prefix=s1.pop();
        System.out.println(prefix);
    }
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

}

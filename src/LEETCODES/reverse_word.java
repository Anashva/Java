package LEETCODES;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        String[] arr=s.split(" ");
        String str="";
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                char ch=arr[i].charAt(j);
                str+=ch+"";
            }
            if(i!=arr.length-1){
                str+=" ";
            }
        }
        System.out.println(str);

    }
}

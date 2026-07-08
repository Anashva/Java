package LEETCODES;

import java.util.Arrays;
import java.util.Scanner;

public class ransom_note {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ransomNote=sc.next();
        String magazine=sc.next();
        System.out.println(canConstruct(ransomNote,magazine));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] charArray1 = ransomNote.toCharArray();
        char[] charArray2 = magazine.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        String str1 = new String(charArray1);
        String str2 = new String(charArray2);

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

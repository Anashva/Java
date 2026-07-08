package LECTURE10.STRING;

public class JAVA {
    public static void main(String [] args){
        System.out.println("MS Dhonii Singh");
        String name="Dhonii";
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("i"));
        //        -1 return karega jab match nhi krega jha se start h
        System.out.print(name.indexOf("n",4));
//        -1 return krega jab match nhi krega
        System.out.println(name.indexOf("ni11"));
//        it return the last index of given string
        System.out.println(name.lastIndexOf("i"));
//        it return the last index of the given string before index 2 & return -1 if it is not in there
        System.out.println(name.lastIndexOf("i",5));
//        it return the tue if given string is equal to dhoni false otherwise
        System.out.println(name.equals("Dhonii"));
//        it ignore upparcase and lowecase and return true if it match with string
        System.out.println(name.equalsIgnoreCase("dhonii"));
//it return double quote " ":-\"
        System.out.println("I am escape sequence \" double quote \" ");


    }
}

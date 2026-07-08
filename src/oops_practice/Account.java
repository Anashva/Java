package oops_practice;

public class Account {
    String accno;
    Account(String accno){
        this.accno=accno;
    }
    @Override
    public String toString(){
        return "account :"  +accno;
    }
    @Override
    public boolean equals(Object o){
        Account a=(Account) o;
        return this.accno.equals(a.accno);
    }
    @Override
    public int hashCode(){
        return accno.hashCode();
    }

    public static void main(String[] args) {
        Account a1=new Account("123");
        Account a2=new Account("123");
        System.out.println(a1);//tostring
        System.out.println(a1.equals(a2));//true
        System.out.println(a1.hashCode());
    }
}

package Enum;

public enum Days {

    Sunday("Sunday"),Monday("Monday"),Tuesday("Tuesday"),Friday("Friday");

    private Days(String lower){
        System.out.println("Our Constructor called");
        this.lower=lower;
    }

    public String getLower() {
        return lower;
    }

    private  String lower;
    public void display(){
        System.out.println("today is " + this.name());
    }
}

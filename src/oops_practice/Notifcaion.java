package oops_practice;

public class Notifcaion {
    MessageService ms;
    void setService(MessageService ms){
        this.ms=ms;
    }
    void notifyuser(){
        ms.send();
    }

    public static void main(String[] args) {
        Notifcaion n=new Notifcaion();
        MessageService ms =new EmailService();
        n.setService(ms);
        n.notifyuser();
    }
}

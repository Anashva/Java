package lecture34_abstraction;

public class abstract_client {
    public static void main(String[] args) {
//        Abstract ab=new Abstract() {
//            ab.payonLine();
//        }
//        Abstract ab=new abstract_demo2();
//        ab.payOnLine();
//        ananymous way-java 8 feature
//        demerit is there-jab jab class banaenge tb tb override krna padega
        Abstract ab1=new Abstract() {
            @Override
            public void payonLine() {

            }
        };
        Abstract ab2=new Abstract() {
            @Override
            public void payonLine() {

            }
        };
    }
}

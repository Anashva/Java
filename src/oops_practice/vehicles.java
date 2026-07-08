package oops_practice;

class vehicles extends Vehicle{
    void run(){
        System.out.println("abstract method implemented from parent to child becuase its cannot be implement in parent");
    }

    public static void main(String[] args) {
            Vehicle v=new vehicles();
        v.run();
        v.fuel();
    }

}

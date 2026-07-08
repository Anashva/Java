package OOPS_LECTURE1;

public class Student1 {
    private String name="dhoni";
    private int age=22;

    public Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        try{
            if(age<0){
                throw new Exception("baklol age -ve nhi hota hai");
            }
            this.age = age;
        }
        catch (Exception e){
            e.printStackTrace();//isse program pura run hoga aur exception bhi throw krega aur kon se line se error hai
        }
//        finally hamesa try,catch k sath ata h aur ye hmesa chlta h program me aur sbse niche likhte h try catch k baad
        finally {
            System.out.println("I am in finaly block");
//            System.exit(1);//program ko vhi pr exit kr deta h aur kuch value leta h
        }

//        exception tabhi aaega jab hmara age negatuve hoga aur (new exception jo object h uski address)e me uski address assign ho jaegi
    }

//    public void setAge(int age) throws  Exception {// jvm handle this exception
////        throws-method ka signature bta rha h may be exception aa skta h
//        if(age<0){
////            jab exception aaega method se bahar throw kiya jaega only
//            throw new Exception("baklol age -ve nhi hota hai");
////            throw-iska kaam h exception ko generate knra
//        }
//        this.age = age;
//    }
}

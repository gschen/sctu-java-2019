package lab02.Test_07;

public class Student extends Person {
    String snumber;
    String school_name;
    public String getInfo(){
        return super.getInfo()+""+snumber+""+school_name;
    }
}

package lab_02.Test_07;

public class Student extends Person{
    String sno;
    String address;
    void printInfo(String sno,String address){
        System.out.println("学号为：" + sno + "\n" + "学校地址为：" + address);
    }
}

package lab_02.Test_15;

import lab_02.test_15.StudentInterface;
import lab_02.test_15.TeacherInterface;

public class Test_15 {
    public static void main(String[] args) {
        StudentInterface1 studentInterface1=new StudentInterface1("小明","男",20,3000);
        studentInterface1.setFee();
        TeacherInterface teacherInterface=new TeacherInterface1("小明","男",20,8000);
        teacherInterface.setPay();
    }
}

class StudentInterface1 implements StudentInterface {
    String name;
    String sex;
    int age;
    int fee;
    public StudentInterface1(String name,String sex,int age,int fee){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.fee=fee;
    }
    @Override
    public void setFee() {
        this.fee=fee;
        System.out.println("学生姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n学费为："+fee);

    }

    @Override
    public int getFee() {
        return fee;
    }
}

class TeacherInterface1 implements TeacherInterface{
    String name;
    String sex;
    int age;
    int pay;
    public TeacherInterface1(String name,String sex,int age,int pay){
        this.pay=pay;
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    @Override
    public void setPay() {
        this.pay=pay;
        System.out.println("教师姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n工资为："+pay);
    }

    @Override
    public int getPay() {
        return pay;
    }
}
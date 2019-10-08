package lab_02.test_07;

public class Student extends Person{

    //添加属性 学号，所在学校信息
    String number,school;

//创造student类的编造器
    public Student(String name, int age, String ID) {
        super(name, age, ID);
        this.number=number;
        this.school=school;
    }
    //分装student类的属性


    public String getNumber() {
        return number;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void test(){
        super.test();
        System.out.println("学号："+number);
        System.out.println("学校："+school);
    }
}


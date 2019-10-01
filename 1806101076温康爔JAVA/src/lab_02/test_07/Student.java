package lab_02.test_07;

public class Student extends Person {
    //成员变量
    //人名、年龄、身份证号、学号、学校
    private String school;
    private int sno;

    public Student(String name, int age, String idno) {
        super(name, age, idno);//super关键字
    }

    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public int getSno(){
        return sno;
    }
    public void setSno(int sno){
        this.sno=sno;
    }
    public String getInfo(){
        return "姓名："+getName()+"年龄："+getAge()+"身份证号："+getIdno()+"学校："+getSchool()+"学号："+getSno();
    }
}

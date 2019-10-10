package lab_02.Test_09;

public class Student {
    private  String stuno;
    private  String stucno;
    private  String stuname;
    private  String stusex;
    private  int stuage;
    public void getsno(String sno){
        this.stuno = sno;
    }
    public void getcno(String cno){
        this.stucno = cno;
    }
    public void getname(String name){
        this.stuname = name;
    }
    public void getage(int age){
        this.stuage = age;
    }
    public void getsex(String sex){
        this.stusex = sex;
    }
    public void StringtoString(String stuno,String stucno,String stuname,String stusex,int stuage){
        System.out.println("学号：" + stuno + "\n" +
                            "班号：" + stucno + "\n" +
                            "姓名：" + stuname + "\n" +
                            "性别：" + stusex + "\n" +
                            "年龄：" + stuage);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.StringtoString("1606101001","信管03","冯博","男",21);
    }
}

package lab_02;

public class Test_09 {
    public static void main(String[] args) {
        Student2 student2=new Student2(11,"s1","张三","男",21);
        //
        System.out.println(student2.toString());
    }
}
class Student2{
    private int no;
    private String cno;
    private String name;
    private String sex;
    private int age;

    public Student2(int no,String cno,String name,String sex,int age){
        this.age=age;
        this.cno=cno;
        this.name=name;
        this.no=no;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNo() {
        return no;
    }

    public String getCno() {
        return cno;
    }

    public String getSex() {
        return sex;
    }
    public String toString(){
        String s="学号"+no+"\n班级号"+cno+"\n姓名"+name+"\n性别"+sex+"\n年龄"+age;
        return s;
    }
}

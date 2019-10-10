package lab_02.Test_09;
//9、 	编写一个Java程序片断，以定义一个表示学生的类Student。这个类的属性有“学号”、“班号”、“姓名”、“性别”、“年龄”，方法有
//“获得学号”、“获得班号”、“获得性别”、“获得姓名”、“获得年龄”、“获得年龄”。为类Student增加一个方法public String toString( )，
//        该方法把Student类的对象的所有属性信息组合成一个字符串以便输出显示。
public class Student {
    private String studentCode,classCode,name,sex;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", classCode='" + classCode + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String studentCode, String classCode, String name, String sex, int age) {
        this.studentCode = studentCode;
        this.classCode = classCode;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}

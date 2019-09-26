package lab_02.Test_07;
/*7、 	定义一Person类，该类具有属性
人名、年龄、身份证号等信息以及将属性信息作为字符串返回的一方法；
定义一Student类，让该类继承Person类，该类除了具有属性人名、年龄、身份证号等信息以外还有学号，
所在学校等信息；该类也具有将属性信息作为字符串返回的一方法；请编写测试类，测试这两个类。*/
public class Person {
    String name;
    int age;
    int no;
    public Person(String name, int age, int no){
        this.name = name;
        this.age = age;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no=" + no +
                '}';
    }
}

class Student extends Person{
    String sno;
    String school;
    public Student(String name, int age, int no,String sno,String school) {
        super(name, age, no);
        this.sno = sno;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no=" + no +
                ", sno='" + sno + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student = new Student("wdwad",19,510121,"180610","sctu");
        System.out.println(student);
    }
}

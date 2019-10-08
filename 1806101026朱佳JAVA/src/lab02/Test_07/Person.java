package lab02.Test_07;

public class Person {
    String name;
    String age;
    String id;

    public String getInfo() {
        return (name+" "+age+" "+id);
    }
}


class Student extends Person {
    String snumber;
    String school;

    public String getInfo() {
        return super.getInfo() + " " + snumber + " " + school;
    }

    public static void main(String[] args) {
            Person p=new Person();
            p.name="姓名：haha";
            p.age="年龄：21";
            p.id="身份证号：172882992739999356";
            Student s=new Student();
            s.name="姓名：haha";
            s.age="年龄：21";
            s.id="身份证号：172882992739999356";
            s.snumber="学号：1806101000";
            s.school ="学校：四川旅游学院";

            System.out.println(p.getInfo() );
            System.out.println(s.getInfo() );
        }
}



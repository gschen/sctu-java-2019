package lab_02;

public class Test {

        public static void main(String[] args) {
            Person p=new Person();
            p.age="年龄为：20";
            p.name="姓名：xx";
            p.number="身份证号：12345";
            Student2 s=new Student2();
            s.age="年龄为：20";
            s.name="姓名：xx";
            s.number="身份证号：12345";
            s.school_name="学校：四川旅游学院";
            s.snumber="学号：0987";
            System.out.println(p.getInfo());
            System.out.println(s.getInfo());


        }
    }


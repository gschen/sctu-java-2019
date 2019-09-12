package lab_02;

public class Test_07 {
     static class Person{
        private String name;
        private String age;
        private String id;
        public String getInfo(){
            return (name+" "+age+""+id);
        }

    }
     static class Student extends Person{
        private String Sid;
        private String name_school;
        public String getInfo(){
            return super.getInfo()+""+Sid+""+name_school;
        }

    }

        public static void main(String[] args) {
            Person p = new Person();
            p.age = "年龄：19";
            p.name = "名字：刘玉江";
            p.id = "学号：73";
            Student s = new Student();

            s.name_school = "学校：四川旅游学院";
            s.Sid = "身份证号码:511...";
            System.out.println(p.getInfo());
            System.out.println(s.getInfo());


    }
}

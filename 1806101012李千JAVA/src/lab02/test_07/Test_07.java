package lab02.test_07;

public class Test_07 {
    public static void main(String[] args) {
        Person man = new Person();
        man.person();
        man.name = "li";
        man.age = 18;
        man.number = 1234567;
        System.out.println(man.person());
        System.out.println(" ");
        Student other = new Student();
        other.student();
        other.xue = 1234;
        other.school = "川旅";
        System.out.println(other.student());

    }
}
    //定义person类
    class Person{
        //属性  人名  年龄  身份证号码
        String name;
        int age;
        int number;
        //作为字符串返回  方法
        public String person(){
            return ("name:"+name+"age:"+age+"number:"+number);

        }
    }
    //student类  继承person
     class Student extends Person{
        //属性  学号   学校
        int xue;
        String school;
        //字符串返回  方法
        public String student(){
            return ("学号:"+xue+"学校:"+school);
        }
    }


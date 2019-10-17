package lab_02.Test_07;
//          7、 	定义一Person类，该类具有属性人名、年龄、身份证号等信息以及将属性信息作为字符串返回的一方法；定义一Student类，让该类继承Person类，
//           该类除了具有属性人名、年龄、身份证号等信息以外还有学号，所在学校等信息；该类也具有将属性信息作为字符串返回的一方法；请编写测试类，测试这两个类。
public class Person {
    private String name;
    private int age;
    private String personId;

    public String String() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personId='" + personId + '\'' +
                '}'
                +"我是父类person";
    }
}

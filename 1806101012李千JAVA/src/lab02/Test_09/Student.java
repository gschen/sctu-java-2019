package lab02.Test_09;

public class Student {
    //属性  学号，班号，姓名，性别，年龄
    int number;
    int id;
    String name;
    String sex;
    int age;

    //方法  获得性别，获得年龄， 获得姓名，获得班号，获得学号
    void getNumber(){
        System.out.println("学号：12");
    }
    void getId(){
        System.out.println("班号：3");
    }
    void getNnme(){
        System.out.println("姓名：li");
    }
    void getSex(){
        System.out.println("性别：女");
    }
    void getAge(){
        System.out.println("年龄：18");
    }
    //增加一个方法public String toString( )  所有属性组成字符串输出
    public String toString() {

       return ("学号："+number+"班号:"+id+"姓名："+name+"性别："+sex+"年龄："+age);
    }


    public static void main(String[] args) {
        Student add=new Student();
        add.getNumber();
        add.number=12;
        add.getId();
        add.id=3;
        add.getNnme();
        add.name="li";
        add.getAge();
        add.age=18;
        add.getSex();
        add.sex="女";
        add.toString();
        System.out.println(add.toString());

    }
}


package lab_02.day20190912;

public class User {
    User(){
    }
    //3.非常特殊的函数。 -- 构造函数
    //1)函数的名字与类名一致；
    //2)函数没有返回值类型
    User(String name, int age) {
        //对成员变量进行赋值(初始化)
        //this.name = "冯博";
        //this.age = 21;
        this.name = name;
        this.age = age;
        System.out.println("性名为：" + this.name);
        System.out.println("年龄为：" + this.age);
    }

    //1.成员变量、属性
    String name;      //Ctrl + B 查看类的源代码
    int age;
    String sex;
    String address;
    float height;
    float weight;

    //2.成员方法、行为
    void study() {
        //int age;      局部变量（只能在该方法里面使用）
        System.out.println("姓名为: " + this.name);
        System.out.println("年龄为：" + this.age);

    }
    /*
    public static void main(String[] args) {

    User user = new User();
    user.name = "杨渤德";
    user.age = 19;
    user.sex = "男";
    user.address = "四川省成都市龙泉驿区红岭路459号";
    user.study();
    }
    */
}
